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
		
	}
	
	enum Color {
		BLUE, GREEN, RED, YELLOW, PINK, MAGENTA;
	}
}
