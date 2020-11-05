package ticTacToe;
import java.util.Scanner;
public class TicTacToeGame {
	static char[] board = new char[10];
	static char player = ' ';
	static char computer = ' ';
	
	public static void main(String[] args) {
		createBoard();
	    chooseXorO();
		showBoard();
	}
/* UC-3 Display Board */
	private static void showBoard() {
		for (int index = 1; index < board.length; index = index + 3) {
			System.out.println("|" + board[index] + " |" + board[index + 1] + " |" + board[index + 2] + " |");
			System.out.println("-----------");
		}
	
	}
/* UC-2 Player Choose Letter X or O */
	private static void chooseXorO() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Select either X or O");
			player = scan.next().toUpperCase().charAt(0);
			if (player == 'X' || player == 'O') {
				computer = player == 'X' ? 'O' : 'X';
				break;
			} else {
				System.out.println("Invalid choice,Enter again");
				continue;
			}
		}
		System.out.println(player + " is player " + computer + " is computer");
	}
/* UC-1 Creating Board */
	static void createBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}

}
