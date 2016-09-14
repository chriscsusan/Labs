package Examples;

import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		String goOn = "y";
		System.out.println("Welcome to Rock Paper Scissors!");
		Scanner scanner = new Scanner(System.in);
		Scanner NameScanner = new Scanner(System.in);
		Scanner OpponentScanner = new Scanner(System.in);

		System.out.println("\nPlease enter your name:");
		String ChoiceOfName = NameScanner.next();
		while (goOn.equalsIgnoreCase("y")){
		System.out.println("\nWould you like to play against a random or a rock?");
		String ChoiceOfOpponent = OpponentScanner.next();

		Player opponent;
		Player user = new ScannerPlayer("");

		switch (ChoiceOfOpponent) {
		case "random":
			opponent = new RandomPlayer(ChoiceOfOpponent);
			break;
		case "rock":
			opponent = new RockPlayer(ChoiceOfOpponent);
			break;
		default:
			throw new IllegalArgumentException("Must type 'random' or 'rock'.");
		}

		String userChoice = user.generateRoshambo().toString();
		String opponentChoice = opponent.generateRoshambo().toString();

		System.out.println("\n" + ChoiceOfName + ": " + userChoice);
		System.out.println(ChoiceOfOpponent + ": " + opponentChoice + "\n");
		System.out.println(theResults(userChoice, opponentChoice));
		System.out.println("\nDo you want to play again?");
		goOn = scanner.next();
		}

//		NameScanner.close();
//		OpponentScanner.close();

	}

	public static String theResults(String answer1, String answer2) {
		if (answer1.equals(answer2)) {
			return "TIE!";
		} else if ((answer1.equals("Rock")) & (answer2.equals("Scissors"))) {
			return "ROCK beats SCISSORS... You Win!";
		} else if ((answer1.equals("Rock")) & (answer2.equals("Paper"))) {
			return "PAPER beats ROCK... You Lose!";
		} else if ((answer1.equals("Paper")) & (answer2.equals("Rock"))) {
			return "PAPER beats ROCK... You Win!";
		} else if ((answer1.equals("Paper")) & (answer2.equals("Scissors"))) {
			return "SCISSORS beats PAPER... You Lose!";
		} else if ((answer1.equals("Scissors")) & (answer2.equals("Paper"))) {
			return "SCISSORS beats PAPER... You Win!";
		} else {
			return "ROCK beats SCISSORS... You Lose!";
		}
	}
}