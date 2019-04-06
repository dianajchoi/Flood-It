import java.util.Random;

public class Board {

	private Color[][] board;
	
	public Board(int boardSize) {
		board = new Color[boardSize][boardSize];
	}
	
	public Color getColorAt(int row, int col) {
		return board[row][col];
	}
	
	public void fillBoard() {
		Random rng = new Random();
		Color[] colors = new Color[6];
		for(int i = 0; i < board.length; ++i) {
			for(int j = 0; j < board.length; ++j) {
				board[i][j] = colors[rng.nextInt(6)];
			}
		}
	}
	
	enum Color {
		BLUE, GREEN, RED, YELLOW, PINK, MAGENTA;
	}
}
