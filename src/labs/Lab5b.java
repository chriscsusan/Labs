package labs;
import java.util.Scanner;
import java.util.Random;

public class Lab5b {

	static Scanner scanner;
	static Random random;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		random = new Random();
		String proceed = "y";
		int sides = howManySides(scanner);
		int timesRolled = 1;

		while (proceed.equalsIgnoreCase("y")) {
			rolls(sides, timesRolled, scanner);
			proceed = rollAgain(scanner);
			timesRolled++;
		}
		scanner.close();
	}

	public static int rolls(int sides, int rollNumber, Scanner scanner) {
		int amountOfRolls = rollNumber;
		int roll1 = random.nextInt(sides);
		int roll2 = random.nextInt(sides);
		int result1 = roll1 + 1;
		int result2 = roll2 + 1;
		System.out.println("Roll " + amountOfRolls);
		System.out.println("Die 1: " + result1);
		System.out.println("Die 2: " + result2 + "\r");
		if (result1 == 1 && result2 ==1){
			System.out.println("Snake eyes!");
		}
		if (result1 == 6 && result2 ==6){
			System.out.println("Box cars!");
		}
		if (result1 + result2 == 7 || result1 + result2 ==11){
			System.out.println("Craps!");
		}
		
		amountOfRolls++;

		return amountOfRolls;
	}

	public static int howManySides(Scanner scanner) {
		System.out.println("How many sides should each die have?");
		int diceSides = scanner.nextInt();

		return diceSides;
	}

	public static String rollAgain(Scanner scanner) {
		String again = "y";
		System.out.println("Do you want to roll again? (y/n)");
		again = scanner.next();

		return again;
	}

}
