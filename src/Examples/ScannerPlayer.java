package Examples;

import java.util.Scanner;

public class ScannerPlayer extends Player {

	public ScannerPlayer(String playerName) {
		super(playerName);
	}
	
	@Override
	public Roshambo generateRoshambo(){
		
		Scanner RoshamboSelectorScanner = new Scanner(System.in);
		
		System.out.println("\nRock, paper, or scissors? (R/P/S)");
		String ChoiceOfRoshambo = RoshamboSelectorScanner.next();
		//RoshamboSelectorScanner.close();
		switch(ChoiceOfRoshambo){
		case "R":
		case "r":
			return Roshambo.ROCK;
		case "P":
		case "p":
			return Roshambo.PAPER;
		case "S":
		case "s":
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}
}