/*
 * Copyright 2024 biteytech@protonmail.com
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

package tech.bitey.golpanama;

import static java.lang.foreign.MemorySegment.NULL;
import static tech.bitey.golpanama.GameOfLife.CELL_PX;
import static tech.bitey.golpanama.GameOfLife.HEIGHT_PX;
import static tech.bitey.golpanama.GameOfLife.WIDTH_PX;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import tech.bitey.golpanama.xlib.XColor;
import tech.bitey.golpanama.xlib.XEvent;
import tech.bitey.golpanama.xlib.Xlib_h;

public class RenderX11 implements Render {

	private final MemorySegment display;
	private final long win;
	private final MemorySegment gc; // graphics context

	private final long black, white;

	RenderX11() {

		System.loadLibrary("X11");

		display = Xlib_h.XOpenDisplay(NULL);
		int screen = Xlib_h.XDefaultScreen(display);
		black = Xlib_h.XBlackPixel(display, screen);
		white = Xlib_h.XWhitePixel(display, screen);

		win = Xlib_h.XCreateSimpleWindow(display, Xlib_h.XDefaultRootWindow(display), 0, 0, WIDTH_PX, HEIGHT_PX, 0,
				black, white);

		try (Arena offHeap = Arena.ofConfined()) {
			MemorySegment gameOfLife = offHeap.allocateFrom("Game of Life");
			Xlib_h.XSetStandardProperties(display, win, gameOfLife, gameOfLife, 0, NULL, 0, NULL);

			Xlib_h.XSelectInput(display, win, Xlib_h.ExposureMask());

			Xlib_h.XClearWindow(display, win);
			Xlib_h.XMapRaised(display, win);

			// exposure event
			MemorySegment event = XEvent.allocate(offHeap);
			Xlib_h.XNextEvent(display, event);
		}

		gc = Xlib_h.XCreateGC(display, win, 0, NULL);
	}

	@Override
	public void drawGrid() {
		// set light gray color
		try (Arena offHeap = Arena.ofConfined()) {
			long cmap = Xlib_h.XDefaultColormap(display, 0);
			MemorySegment near_color = XColor.allocate(offHeap), true_color = XColor.allocate(offHeap);
			MemorySegment lightGray = offHeap.allocateFrom("Light Gray");
			Xlib_h.XAllocNamedColor(display, cmap, lightGray, near_color, true_color);
			Xlib_h.XSetForeground(display, gc, XColor.pixel(near_color));
		}

		// draw grid
		for (int x = CELL_PX; x < WIDTH_PX; x += (CELL_PX + 1))
			Xlib_h.XDrawLine(display, win, gc, x, 0, x, HEIGHT_PX);
		for (int y = CELL_PX; y < HEIGHT_PX; y += (CELL_PX + 1))
			Xlib_h.XDrawLine(display, win, gc, 0, y, WIDTH_PX, y);
	}

	@Override
	public void fillCell(boolean state, int x, int y) {
		Xlib_h.XSetForeground(display, gc, state ? black : white);
		Xlib_h.XFillRectangle(display, win, gc, x, y, CELL_PX, CELL_PX);
	}

	@Override
	public void flush() {
		// flush pending requests to the X server
		Xlib_h.XFlush(display);
		Xlib_h.XSync(display, 0);
	}
}
