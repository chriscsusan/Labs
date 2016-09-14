package labs;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String proceed = "y";
		
		while (proceed.equalsIgnoreCase("y")) {
		
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println("Please enter the length:");
			
			double length = scanner.nextDouble();		
			System.out.println("Please enter the width:");
			double width = scanner.nextDouble();		
			System.out.println("Please enter the height:");
			double height = scanner.nextDouble();
		
			double area = width * length;
			double volume = width * length * height;
			double perimeter = 2 * (width + length);
		
			System.out.println("The area of the room is " + area);
			System.out.println("The perimeter of the room is " + perimeter);
			System.out.println("The volume of the room is " + volume);
		
			System.out.println("Continue? (y/n)");		
			proceed = scanner.next();
			System.out.println();
		}
		System.out.println("Fin.");
		scanner.close();
	}
}
