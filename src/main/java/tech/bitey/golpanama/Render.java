package tech.bitey.golpanama;

interface Render {

	void drawGrid();

	void fillCell(boolean state, int x, int y);

	default void flush() {
	}
}
