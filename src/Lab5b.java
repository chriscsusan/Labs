import java.util.Scanner;
import java.util.Random;

public class Lab5b {
	
	static Scanner scanner;
	static Random random;
	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		random = new Random ();
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
		int roll1 = random.nextInt(sides);
		int roll2 = random.nextInt(sides);
		int result1 = (int)roll1;
		int result2 = (int)roll2;
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
