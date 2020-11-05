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
	}

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

	static void createBoard() {
		for (int index = 1; index < 10; index++) {
			board[index] = ' ';
		}
	}

}
