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

package tech.bitey.golpanama;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

class GameOfLife {

	private static final int WIDTH_CELLS = 120;
	private static final int HEIGHT_CELLS = 100;
	static final int CELL_PX = 9;
	static final int WIDTH_PX = WIDTH_CELLS * CELL_PX + (WIDTH_CELLS - 1);
	static final int HEIGHT_PX = HEIGHT_CELLS * CELL_PX + (HEIGHT_CELLS - 1);

	static final int TICK_PERIOD = 50_000_000; // nanos

	private final boolean[][] prev_state = new boolean[HEIGHT_CELLS][WIDTH_CELLS];
	private final boolean[][] state = new boolean[HEIGHT_CELLS][WIDTH_CELLS];

	private final Render render;

	GameOfLife(String[] args, Render render) throws Exception {

		// pattern file
		if (args.length != 1)
			throw new IllegalArgumentException("expecting pattern name as the only argument");

		// initialize state from pattern file
		try (InputStream is = GameOfLife.class.getResourceAsStream("patterns/" + args[0] + ".txt");
				BufferedReader in = new BufferedReader(new InputStreamReader(is));) {

			int y = HEIGHT_CELLS / 2;
			for (String line; (line = in.readLine()) != null; y++) {
				char[] c = line.toCharArray();
				int x = WIDTH_CELLS / 2;
				for (int i = 0; i < c.length; i++, x++)
					if (c[i] == '*')
						state[y][x] = true;
			}
		}

		render.drawGrid();
		render.flush();
		this.render = render;
	}

	void tick() {
		// render
		for (int y = 0; y < HEIGHT_CELLS; y++) {
			for (int x = 0; x < WIDTH_CELLS; x++) {
				if (state[y][x] != prev_state[y][x]) {

					render.fillCell(state[y][x], x * (CELL_PX + 1), y * (CELL_PX + 1));

					prev_state[y][x] = state[y][x];
				}
			}
		}

		render.flush();

		// calculate next state
		for (int y = 0; y < HEIGHT_CELLS; y++) {
			for (int x = 0; x < WIDTH_CELLS; x++) {

				// count neighbors
				int count = 0;
				count += live(x - 1, y - 1);
				count += live(x, y - 1);
				count += live(x + 1, y - 1);
				count += live(x - 1, y);
				count += live(x + 1, y);
				count += live(x - 1, y + 1);
				count += live(x, y + 1);
				count += live(x + 1, y + 1);

				// any live cell with two or three live neighbors survives
				boolean survives = prev_state[y][x] && (count == 2 || count == 3);

				// any dead cell with three live neighbors becomes a live cell
				boolean born = !prev_state[y][x] && count == 3;

				state[y][x] = survives || born;
			}
		}
	}

	private int live(int x, int y) {
		return !(x < 0 || x >= WIDTH_CELLS || y < 0 || y >= HEIGHT_CELLS) && prev_state[y][x] ? 1 : 0;
	}
}
