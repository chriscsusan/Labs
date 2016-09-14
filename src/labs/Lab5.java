package labs;
import java.util.Scanner;

public class Lab5 {
	
	static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		String proceed = "y";
		int sides = howManySides(scanner);
		int timesRolled = 1;
		
		while (proceed.equalsIgnoreCase("y")){
			rolls(sides, timesRolled, scanner);
			proceed = rollAgain(scanner);
			timesRolled++;		
		}
		scanner.close();
	}
	
	
	
	public static int rolls(int sides, int rollNumber, Scanner scanner){
		int amountOfRolls = rollNumber;
		int result1;
		int result2;
		double roll1 = Math.random() * sides;
		double roll2 = Math.random() * sides;
		if (roll1 == sides){
			result1 = (int)roll1;
		}else {
		result1 = (int)roll1 + 1;
		}
		if (roll2 == sides){
			result2 = (int)roll2;
		} else{
		result2 = (int)roll2 + 1;
		}
				
		System.out.println("Roll " + amountOfRolls);
		System.out.println("Die 1: " + result1);
		System.out.println("Die 2: " + result2 + "\r");
		amountOfRolls++;
		
		return amountOfRolls;
	}
	
	public static int howManySides(Scanner scanner){
		System.out.println("How many sides should each die have?");
		int diceSides = scanner.nextInt();
			
		return diceSides;
	}
	
	public static String rollAgain(Scanner scanner){
		String again = "y";
		System.out.println("Do you want to roll again? (y/n)");
		again = scanner.next();
		
		return again;
	}

}
