import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] move = new int[3];
		char[][] board = new char[3][3];
		move[2] = 1;
		String proceed = "y";
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				board[x][y] = '_';
			}
		}
		while (proceed.equalsIgnoreCase("y")) {
			for (int i = 0; i < 9; i++) {
				displayBoard(board);
				move = nextMove(sc, board, move);
				placeMove(board, move);
				if (victoryCheckV(board)) {
					System.out.println("Victory!");
					break;
				}
				if (victoryCheckH(board)) {
					System.out.println("Victory!");
					break;
				}
				if (victoryCheckX(board)) {
					System.out.println("Victory!");
					break;
				}
			}
			displayBoard(board);
			while (true) {
				System.out.println("Do you want to play another game? (y/n)");
				proceed = sc.next();
				if (proceed.equalsIgnoreCase("y") || proceed.equalsIgnoreCase("n")) {
					break;
				} else {
					System.out.println("Invalid entry.  Enter a y or n");
					continue;
				}
			}
		}
	}

	public static void placeMove(char board[][], int move[]) {

		if (move[2] == 1) {
			board[move[0]][move[1]] = 'x';

		} else if (move[2] == 2) {
			board[move[0]][move[1]] = 'o';

		} else {
			System.out.println("Invalid player number");
		}

		if (move[2] == 1) {
			move[2] = 2;
		} else {
			move[2] = 1;
		}
		return;
	}

	public static int[] nextMove(Scanner sc, char board[][], int move[]) {
		System.out.println("\rPlayer " + (move[2]));
		while (true) {
			while (true) {
				System.out.println("Where would you like to go next? (horizontal)");
				try {
					move[0] = sc.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("You must enter an integer value from 0-2.");
					sc.nextLine();
					continue;
				}

				if (move[0] <= 2 && move[0] >= 0) {
					break;
				} else {
					System.out.println("Position out of range");
					System.out.println("Please enter a number from 0-2.");
					continue;
				}

			}

			while (true) {
				System.out.println("Where would you like to go next? (vertical)");
				try {
					move[1] = sc.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("You must enter an integer value from 0-2.");
					sc.nextLine();
					continue;
				}
				if (move[1] <= 2 && move[1] >= 0) {
					break;
				} else {
					System.out.println("Position out of range");
					System.out.println("Please enter a number from 0-2.");
					continue;
				}
			}
			if (board[move[0]][move[1]] != '_') {
				System.out.println("Space is occupied.  Please choose another.");
				continue;
			} else {
				break;
			}

		}
		return move;
	}

	public static void displayBoard(char board[][]) {
		System.out.println("\rCurrent board:");
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(board[x][y]);
				System.out.print(' ');
			}
			System.out.println();
		}
		return;
	}

	public static boolean victoryCheckV(char board[][]) {
		boolean win = false;
		while (true) {
			for (int i = 0; i < 3; i++) {
				if (board[i][0] == 'x' && board[i][1] == 'x' && board[i][2] == 'x') {
					win = true;
					break;
				} else
					win = false;
			}
			if (win == true) {
				break;
			}
			for (int i = 0; i < 3; i++) {
				if (board[i][0] == 'o' && board[i][1] == 'o' && board[i][0] == 'o') {
					win = true;
					break;
				} else
					win = false;
			}
			break;
		}
		return win;
	}

	public static boolean victoryCheckH(char board[][]) {
		boolean win = false;
		while (true) {
			for (int i = 0; i < 3; i++) {
				if (board[0][i] == 'x' && board[1][i] == 'x' && board[2][i] == 'x') {
					win = true;
					break;
				} else
					win = false;
			}
			if (win == true) {
				break;
			}
			for (int i = 0; i < 3; i++) {
				if (board[0][i] == 'o' && board[1][i] == 'o' && board[2][i] == 'o') {
					win = true;
					break;
				} else
					win = false;
			}
			break;
		}
		return win;
	}

	public static boolean victoryCheckX(char board[][]) {
		boolean win = false;
		while (true) {
			for (int i = 0; i < 3; i++) {
				if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
					win = true;
					break;
				} else
					win = false;
			}
			if (win == true) {
				break;
			}
			for (int i = 0; i < 3; i++) {
				if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') {
					win = true;
					break;
				} else
					win = false;
			}
			break;
		}
		while (true) {
			if (win == true) {
				break;
			}
			for (int i = 2; i > 0; i--) {
				if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
					win = true;
					break;
				} else
					win = false;
			}
			if (win == true) {
				break;
			}
			for (int i = 0; i < 3; i++) {
				if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
					win = true;
					break;
				} else
					win = false;
			}
			break;
		}
		return win;
	}
}