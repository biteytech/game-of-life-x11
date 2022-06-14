package tech.bitey.jlife;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JLife extends Application implements Runnable {

	private static Path PATTERN_FILE;

	private final int WIDTH_CELLS = 120;
	private final int HEIGHT_CELLS = 100;
	private final int CELL_PX = 9;
	private final int WIDTH_PX = WIDTH_CELLS * CELL_PX + (WIDTH_CELLS - 1);
	private final int HEIGHT_PX = HEIGHT_CELLS * CELL_PX + (HEIGHT_CELLS - 1);

	private final int TICK_PERIOD = 50; // milliseconds

	private final boolean[][] prev_state = new boolean[HEIGHT_CELLS][WIDTH_CELLS];
	private final boolean[][] state = new boolean[HEIGHT_CELLS][WIDTH_CELLS];

	private GraphicsContext gc;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("expecting pattern name as the only argument");
			System.exit(1);
		}

		PATTERN_FILE = Paths.get("../patterns", args[0] + ".txt");
		if (!Files.exists(PATTERN_FILE)) {
			System.err.println("pattern file does not exist: " + PATTERN_FILE);
			System.exit(1);
		}

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// initialize JavaFX and GC
		primaryStage.setTitle("Game of Life");
		Group root = new Group();
		Canvas canvas = new Canvas(WIDTH_PX, HEIGHT_PX);
		gc = canvas.getGraphicsContext2D();
		gc.setImageSmoothing(false);
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

		// draw grid
		gc.setStroke(Color.LIGHTGRAY);
		for (int x = CELL_PX; x < WIDTH_PX; x += (CELL_PX + 1))
			gc.strokeLine(x + 0.5, 0, x + 0.5, HEIGHT_PX);
		for (int y = CELL_PX; y < HEIGHT_PX; y += (CELL_PX + 1))
			gc.strokeLine(0, y + 0.5, WIDTH_PX, y + 0.5);

		// initialize state
		List<String> pattern = null;
		try {
			pattern = Files.lines(PATTERN_FILE).toList();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		int y = HEIGHT_CELLS / 2, x;
		for (String line : pattern) {
			char[] c = line.toCharArray();
			x = WIDTH_CELLS / 2;
			for (int i = 0; i < c.length; i++, x++)
				if (c[i] == '*')
					state[y][x] = true;
			y++;
		}

		Thread t = new Thread(this);
		t.setDaemon(true);
		t.start();
	}

	@Override
	public void run() {
		// each iteration is one tick
		while (true) {
			final long time = System.currentTimeMillis();

			// render
			for (int y = 0; y < HEIGHT_CELLS; y++) {
				for (int x = 0; x < WIDTH_CELLS; x++) {
					if (state[y][x] != prev_state[y][x]) {

						gc.setFill(state[y][x] ? Color.BLACK : Color.WHITE);
						gc.fillRect(x * (CELL_PX + 1), y * (CELL_PX + 1), CELL_PX, CELL_PX);

						prev_state[y][x] = state[y][x];
					}
				}
			}

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
					boolean survives = prev_state[y][x] && (count == 2 || count == 3);

					// any dead cell with three live neighbors becomes a live cell
					boolean born = !prev_state[y][x] && count == 3;

					state[y][x] = survives || born;
				}
			}

			try {
				Thread.sleep(TICK_PERIOD - (System.currentTimeMillis() - time));
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private int live(int x, int y) {
		return !(x < 0 || x >= WIDTH_CELLS || y < 0 || y >= HEIGHT_CELLS) && prev_state[y][x] ? 1 : 0;
	}
}
