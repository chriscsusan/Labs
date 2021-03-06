package watchyourstep;

import java.util.Scanner;

public class MinesweeperApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SkillLevel skill = SkillLevel.BEGINNER;
		boolean skillquestion = true;
		String userprompt = "y";
		int x = 0;
		int y = 0;
		int mines = 0;
		int h = 0;
		int v = 0;
		char hchar = 0;
		char vchar = 0;

		HiddenMinefield hiddenBoard=null;
//		Minefield displayBoard = new Minefield(5, 5);

		while (userprompt.equalsIgnoreCase("y")) {
			System.out.println(
					"Choose difficulty level:\nBeginner\nIntermediate\nExpert\nCustom");
			String response = scanner.next().toLowerCase();
			while (skillquestion == true) {
				switch (response) {
				case "beginner":
					skill = SkillLevel.BEGINNER;
					skillquestion = false;
					hiddenBoard = new HiddenMinefield(8, 8, 12);
					hiddenBoard.placeMines();
					hiddenBoard.setNumbers();
					scanner.nextLine();
					break;

				case "intermediate":

					skill = SkillLevel.INTERMEDIATE;
					skillquestion = false;
					hiddenBoard = new HiddenMinefield(15, 15, 25);
					hiddenBoard.placeMines();
					hiddenBoard.setNumbers();
					scanner.nextLine();
					break;

				case "expert":
					skill = SkillLevel.EXPERT;
					skillquestion = false;
					hiddenBoard = new HiddenMinefield(16, 30, 99);
					hiddenBoard.placeMines();
					hiddenBoard.setNumbers();
					scanner.nextLine();
					break;
				case "custom":
					scanner.nextLine();
					skill = SkillLevel.CUSTOM;
					skillquestion = false;
					System.out.println("How wide do you want the field to be?");
					h = scanner.nextInt();
					System.out.println("How tall do you want the field to be?");
					v = scanner.nextInt();
					System.out.println("How many mines do you want in the field?");
					mines = scanner.nextInt();
					scanner.nextLine();
					hiddenBoard = new HiddenMinefield(v, h, mines);
					hiddenBoard.placeMines();
					hiddenBoard.setNumbers();
					break;

				default:
					System.out.println("Invalid choice please choose again from the options listed.");
					scanner.nextLine();
				}
			}
//			v = verticalCoordinate(scanner, hiddenBoard);
//			h = horizontalCoordinate(scanner, hiddenBoard);

//			hiddenBoard.playerMove(v, h);
//			hiddenBoard.checkForJustRevealed();
//			hiddenBoard.revealedCells();
//			hiddenBoard.displayBoard();

//			while (true) {
//				System.out.println("Enter a ! to flag a mine and ~ to unflag it.");
//				if (hiddenBoard.checkCell(v, h) && !hiddenBoard.board[v][h].isFlagged()) {
//					hiddenBoard.revealBoard();
//					System.out.println("You lose!");
//					break;
//				}
//				if (hiddenBoard.checkForWin() == true) {
//					System.out.println("You won!");
//					break;
//				}
//				v = verticalCoordinate(scanner, hiddenBoard);
//				h = horizontalCoordinate(scanner, hiddenBoard);
//				hiddenBoard.playerMove(v, h);
//				hiddenBoard.checkForJustRevealed();
//				hiddenBoard.revealedCells();
//
//			}
			scanner.nextLine();
			skillquestion = true;
			System.out.println("Would you like to play again(y/n)");
			userprompt = scanner.next();
			scanner.nextLine();

		}
		System.out.println("\nGoodbye.");
		scanner.close();
	}

	public static int verticalCoordinate(Scanner scanner, HiddenMinefield hiddenBoard) {
		char vchar = 0;
		int v = 0;
		int h = 0;
		while (true) {
			
			
			System.out.println("Please enter your vertical coordinate");
			vchar = scanner.next().charAt(0);
			if (vchar == '!'){
				System.out.println("Flag a mine");
				v = verticalCoordinate(scanner, hiddenBoard);
				h = horizontalCoordinate(scanner, hiddenBoard);
				hiddenBoard.board[v][h].setFlag();
//				displayBoard.changeToFlag(v, h);
//				displayBoard.displayBoard();
				continue;
			}
			if (vchar == '~'){
				System.out.println("Flag a mine");
				v = verticalCoordinate(scanner, hiddenBoard);
				h = horizontalCoordinate(scanner, hiddenBoard);
				hiddenBoard.board[v][h].unsetFlag();
//				displayBoard.board[v+1][h+1] = '=';
//				displayBoard.displayBoard();
				
			}
			
			if (vchar >= 'A' && vchar <= 'Z') {
				if (vchar >= hiddenBoard.board.length + 65) {
					System.out.println("Does not exist in board!");
				} else {
					v = (int) (vchar - 65);
					break;
				}
			} else if (vchar >= 'a' && vchar <= 'z') {
				if (vchar >= hiddenBoard.board.length + 70) {
					System.out.println("Does not exist in board!");
				} else {
					v = (int) (vchar - 70);
					break;
				}
			}

			else {
				System.out.println(" Try again silly!");
			}
		}

		return v;
	}

	public static int horizontalCoordinate(Scanner scanner, HiddenMinefield hiddenBoard) {
		char hchar = 0;
		int h = 0;

		while (true) {
			System.out.println("Please enter your horizontal coordinate");
			hchar = scanner.next().charAt(0);
			if (hchar >= 'A' && hchar <= 'Z') {
				if (hchar >= hiddenBoard.board.length + 65) {
					System.out.println("Does not exist in board!");
				} else {
					h = (int) (hchar - 65);
					break;
				}
			} else if (hchar >= 'a' && hchar <= 'z') {
				if (hchar >= hiddenBoard.board.length + 70) {
					System.out.println("Does not exist in board!");
				} else {
					h = (int) (hchar - 70);
					break;
				}
			}

			else {
				System.out.println(" Try again silly!");
			}
		}

		return h;
	}
}
