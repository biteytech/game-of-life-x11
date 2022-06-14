package tech.bitey.golpanama;

import static tech.bitey.golpanama.GameOfLife.CELL_PX;
import static tech.bitey.golpanama.GameOfLife.HEIGHT_PX;
import static tech.bitey.golpanama.GameOfLife.WIDTH_PX;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RenderJavaFX implements Render {

	private final GraphicsContext gc;

	RenderJavaFX(Stage primaryStage) {
		// JavaFX window stuff
		Group root = new Group();
		Canvas canvas = new Canvas(WIDTH_PX, HEIGHT_PX);
		root.getChildren().add(canvas);

		primaryStage.setTitle("Game of Life");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

		// graphics context
		gc = canvas.getGraphicsContext2D();
		gc.setImageSmoothing(false);
	}

	@Override
	public void drawGrid() {

		gc.setStroke(Color.LIGHTGRAY);

		for (int x = CELL_PX; x < WIDTH_PX; x += CELL_PX + 1)
			gc.strokeLine(x + 0.5, 0, x + 0.5, HEIGHT_PX);

		for (int y = CELL_PX; y < HEIGHT_PX; y += CELL_PX + 1)
			gc.strokeLine(0, y + 0.5, WIDTH_PX, y + 0.5);
	}

	@Override
	public void fillCell(boolean state, int x, int y) {
		gc.setFill(state ? Color.BLACK : Color.WHITE);
		gc.fillRect(x, y, CELL_PX, CELL_PX);
	}
}
