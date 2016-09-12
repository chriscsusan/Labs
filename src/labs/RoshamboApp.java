package labs;

import java.util.Scanner;

public class RoshamboApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Player opponent;
		String opponentChoice;
		Roshambo humanResult;
		Roshambo opponentResult;
		String playAgain = "y";

		System.out.println("Get ready to play Roshambo.");
		System.out.println("What is your name?");
		Player humanPlayer = new HumanPlayer(sc.next());
		sc.nextLine();
		while (playAgain.equalsIgnoreCase("y")) {
			while (true) {
				System.out.println("Do you want to play against a predictable opponent? (y/n)");
				opponentChoice = sc.next();
				if (opponentChoice.equalsIgnoreCase("y")) {
					opponent = new AlwaysRock("Dwayne Johnson");
					break;
				} else if (opponentChoice.equalsIgnoreCase("n")) {
					opponent = new RandomPlayer("Loose cannon");
					break;
				} else {
					System.out.println("Please choose Y for yes or N for no.");
					continue;
				}
			}
			
			humanResult = humanPlayer.generateRoshambo();
			opponentResult = opponent.generateRoshambo();
			System.out.println(humanPlayer.getName() + " threw: " + humanResult);
			System.out.println(opponent.getName() + " threw: " + opponentResult);

			switch (humanResult) {
			case ROCK:
				if (opponentResult == Roshambo.PAPER) {
					System.out.println("Dang, you lost.");
					humanPlayer.losses++;
				} else if (opponentResult == Roshambo.ROCK) {
					System.out.println("It's a tie!  Nobody wins.");
					humanPlayer.ties++;
				} else {
					System.out.println("You won!  Woo!");
					humanPlayer.wins++;
				}
				break;
			case PAPER:
				if (opponentResult == Roshambo.SCISSORS) {
					System.out.println("Uh oh, you lost.");
					humanPlayer.losses++;
				} else if (opponentResult == Roshambo.PAPER) {
					System.out.println("It's a tie!  Nobody wins.");
					humanPlayer.ties++;
				} else {
					System.out.println("You won!  Woo!");
					humanPlayer.wins++;
				}
				break;
			case SCISSORS:
				if (opponentResult == Roshambo.ROCK) {
					System.out.println("You lost.  Better luck next time.");
					humanPlayer.losses++;
				} else if (opponentResult == Roshambo.SCISSORS) {
					System.out.println("It's a tie!  Nobody wins.");
					humanPlayer.ties++;
				} else {
					System.out.println("You won!  Woo!");
					humanPlayer.wins++;
				}
				break;
			default:
			}
			System.out.println(
					"\nWins: " + humanPlayer.wins + "\nLosses: " + humanPlayer.losses + "\nTies: " + humanPlayer.ties
							+ "\nTotal games: " + (humanPlayer.wins + humanPlayer.losses + humanPlayer.ties));
			sc.nextLine();
			System.out.println("\nWould you like to play again? (y/n)");
			playAgain = sc.next();
		}
		System.out.println("Goodbye.");
	}
}
