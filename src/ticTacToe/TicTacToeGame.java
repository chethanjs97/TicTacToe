package ticTacToe;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createBoard();
	}
	/* UC-1 */
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int index=1;index<board.length;index++){
			board[index] = ' ';
		}
		return board;
	}

}
