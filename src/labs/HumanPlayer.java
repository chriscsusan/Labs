package labs;

import java.util.Scanner;

public class HumanPlayer extends Player {
	Scanner sc = new Scanner(System.in);
	String temp;
	Roshambo result;
	String name;

	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		while (true) {
			System.out.println("Choose paper, rock, or scissors. (P/R/S)");
			temp = sc.next();
			if (temp.equalsIgnoreCase("p")) {
				result = Roshambo.PAPER;
				break;
			} else if (temp.equalsIgnoreCase("r")) {
				result = Roshambo.ROCK;
				break;
			} else if (temp.equalsIgnoreCase("s")) {
				result = Roshambo.SCISSORS;
				break;
			} else {
				sc.nextLine();
				System.out.println("You didn't choose a valid option.");
				continue;
			}
		}
		return result;
	}

}
