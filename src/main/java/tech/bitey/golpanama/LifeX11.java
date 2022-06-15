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

public class LifeX11 {

	public static void main(String[] args) throws Exception {

		final GameOfLife game = new GameOfLife(args, new RenderX11());

		new Thread(() -> {
			while (true) {
				final long time = System.currentTimeMillis();

				game.tick();

				try {
					long millis = (GameOfLife.TICK_PERIOD / 1_000_000) - (System.currentTimeMillis() - time);
					if (millis > 0)
						Thread.sleep(millis);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}).start();
	}
}
