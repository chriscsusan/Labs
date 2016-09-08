package labs;

import java.util.Scanner;

public class HumanPlayer extends Player{
	Scanner sc = new Scanner(System.in);
	String temp;
	Roshambo result;
	String name;
	
	@Override
	public Roshambo generateRoshambo(){
		System.out.println("Choose paper, rock, or scissors. (P/R/S)");
		temp = sc.next();
		if(temp.equalsIgnoreCase("p")){
			result = Roshambo.PAPER;
		}else if (temp.equalsIgnoreCase("r")){
			result = Roshambo.ROCK;
		}else if(temp.equalsIgnoreCase("s")){
			result = Roshambo.SCISSORS;
		}else{
			System.out.println("Something went wrong.");
		}
		return result;
	}

}
