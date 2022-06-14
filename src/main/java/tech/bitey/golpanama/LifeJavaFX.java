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

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeJavaFX extends Application {

	private static String[] ARGS;

	public static void main(String[] args) {
		launch(ARGS = args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		RenderJavaFX renderLogic = new RenderJavaFX(primaryStage);
		GameOfLife game = new GameOfLife(ARGS, renderLogic);

		Thread t = new Thread(game, "Game");
		t.setDaemon(true);
		t.start();
	}
}
