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
