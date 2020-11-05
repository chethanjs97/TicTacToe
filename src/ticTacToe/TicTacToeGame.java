package ticTacToe;
import java.util.Scanner;



public class TicTacToeGame {

	static char[] board = new char[10];

	public static void main(String[] args) {
		char player = ' ';
		char computer = ' ';
		createBoard();
		player = selectXorO();
		if (player == 'X') {
			computer = 'O';
		} else {
			computer = 'X';
		}
		System.out.println(player + " is player " + computer + " is computer");
		showBoard();
	}
	/* UC-3 Display Board */
	private static void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("--+---+--");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("--+---+--");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}
/* UC-2 Player Choose Letter X or O */
	private static char selectXorO() {
		char player = 'X';
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select either X or O");
			player = scan.next().charAt(0);
			if (player == 'x' || player == 'X') {
				return 'X';
			} else if (player == 'o' || player == 'O') {
				return 'O';
			} else {
				System.out.println("Invalid choice,Enter again");
				continue;
			}
		}
	}
	/* UC-1 Creating Board */
	static void createBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}

}
