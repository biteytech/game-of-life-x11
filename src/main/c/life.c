/*
 * Copyright 2022 biteytech@protonmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This implementation is completely independent of the Java code.
 */

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <X11/X.h>
#include <X11/Xlib.h>
#include <X11/Xutil.h>
#include <time.h>

unsigned long black, white;
Display *dis;
Window win;
GC gc;

char* PATTERN_FILE;

const int WIDTH_CELLS = 120;
const int HEIGHT_CELLS = 100;
const int CELL_PX = 9;
const int WIDTH_PX = WIDTH_CELLS * CELL_PX + (WIDTH_CELLS - 1);
const int HEIGHT_PX = HEIGHT_CELLS * CELL_PX + (HEIGHT_CELLS - 1);

const int TICK_PERIOD = 50 * 1000; // 50 milliseconds

bool** prev_state;
bool** state;

void initState() {

	// allocate bool arrays
	prev_state = (bool**) malloc(HEIGHT_CELLS * sizeof(bool*));
	state = (bool**) malloc(HEIGHT_CELLS * sizeof(bool*));
	const int widthBytes = WIDTH_CELLS * sizeof(bool);
	for (int i = 0; i < HEIGHT_CELLS; i++) {
		prev_state[i] = (bool*) malloc(widthBytes);
		memset(prev_state[i], 0, widthBytes);

		state[i] = (bool*) malloc(widthBytes);
		memset(state[i], 0, widthBytes);
	}

	// process pattern
	FILE* pattern = fopen(PATTERN_FILE, "r");
	if (pattern == NULL) {
		fprintf(stderr, "failed to open pattern file\n");
		exit(EXIT_FAILURE);
	}

	char* line = NULL;
	size_t len = 0;
	ssize_t read;

	int y = HEIGHT_CELLS / 2, x;
	while ((read = getline(&line, &len, pattern)) != -1) {
		x = WIDTH_CELLS / 2;

		for (int i = 0; i < read - 1; i++, x++)
			if (line[i] == '*')
				state[y][x] = true;
		y++;
	}

	free(line);
}

void flushDraw() {
	// flush all pending requests to the X server
	XFlush(dis);
	XSync(dis, False);
}

void drawGrid() {

	// set light gray color
	Colormap cmap = DefaultColormap(dis, 0);
	XColor near_color, true_color;
	XAllocNamedColor(dis, cmap, "Light Gray", &near_color, &true_color);
	XSetForeground(dis, gc, near_color.pixel);

	// draw grid
	for (int x = CELL_PX; x < WIDTH_PX; x += (CELL_PX + 1))
		XDrawLine(dis, win, gc, x, 0, x, HEIGHT_PX);
	for (int y = CELL_PX; y < HEIGHT_PX; y += (CELL_PX + 1))
		XDrawLine(dis, win, gc, 0, y, WIDTH_PX, y);

	flushDraw();
}

// elapsed time in nanoseconds
int64_t elapsed(struct timespec *timeA_p, struct timespec *timeB_p) {
	return ((timeA_p->tv_sec * 1000000000) + timeA_p->tv_nsec)
			- ((timeB_p->tv_sec * 1000000000) + timeB_p->tv_nsec);
}

int live(int x, int y) {
	return !(x < 0 || x >= WIDTH_CELLS || y < 0 || y >= HEIGHT_CELLS)
			&& prev_state[y][x] ? 1 : 0;
}

int main(int argc, char *argv[]) {

	if(argc != 2) {
		fprintf(stderr, "expecting path to pattern file as the only argument\n");
		return 1;
	}
	PATTERN_FILE = argv[1];

	int screen;

	/* use the information from the environment variable DISPLAY to create the X connection */
	dis = XOpenDisplay((char *) 0);
	screen = XDefaultScreen(dis);
	black = BlackPixel(dis, screen); /* get color black */
	white = WhitePixel(dis, screen); /* get color white */

	/* once the display is initialized, create the window */
	win = XCreateSimpleWindow(dis, DefaultRootWindow(dis), 0, 0, WIDTH_PX,
			HEIGHT_PX, 0, black, white);

	/* Set window title */
	XSetStandardProperties(dis, win, "Game of Life", "Game of Life", None, NULL,
			0, NULL);

	/* select exposure event */
	XSelectInput(dis, win, ExposureMask);

	/* create the Graphics Context */
	gc = XCreateGC(dis, win, 0, 0);

	/* clear the window and bring it on top of the other windows */
	XClearWindow(dis, win);
	XMapRaised(dis, win);

	/* wait for exposure event */
	XEvent event;
	XNextEvent(dis, &event);

	initState();
	drawGrid();

	/* each iteration is one tick */
	while (true) {
		struct timespec start, end;
		clock_gettime(CLOCK_MONOTONIC, &start);

		// render
		for (int y = 0; y < HEIGHT_CELLS; y++) {
			for (int x = 0; x < WIDTH_CELLS; x++) {
				if (state[y][x] != prev_state[y][x]) {

					XSetForeground(dis, gc, state[y][x] ? black : white);
					XFillRectangle(dis, win, gc, x * (CELL_PX + 1),
							y * (CELL_PX + 1), CELL_PX, CELL_PX);

					prev_state[y][x] = state[y][x];
				}
			}
		}
		flushDraw();

		// calculate next state
		for (int y = 0; y < HEIGHT_CELLS; y++) {
			for (int x = 0; x < WIDTH_CELLS; x++) {

				// count neighbors
				int count = 0;
				{
					count += live(x - 1, y - 1);
					count += live(x, y - 1);
					count += live(x + 1, y - 1);
					count += live(x - 1, y);
					count += live(x + 1, y);
					count += live(x - 1, y + 1);
					count += live(x, y + 1);
					count += live(x + 1, y + 1);
				}

				// any live cell with two or three live neighbors survives
				bool survives = prev_state[y][x] && (count == 2 || count == 3);

				// any dead cell with three live neighbors becomes a live cell
				bool alive = !prev_state[y][x] && count == 3;

				state[y][x] = survives || alive;
			}
		}

		clock_gettime(CLOCK_MONOTONIC, &end);
		usleep(TICK_PERIOD - elapsed(&end, &start) / 1000);
	}

	return 0;
}
