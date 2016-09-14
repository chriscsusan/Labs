package labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = 0.0;
		String keepGoing = "y";

		while (keepGoing.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Circle Tester.");
			while (true) {
				System.out.println("Please enter a radius.");
				try {
					radius = sc.nextDouble();
					if(radius <= 0.0){
						System.out.println("Invalid entry.  Please enter a positive number.");
						continue;
					}
					break;
				} catch (InputMismatchException ex) {
					System.out.println("Invalid entry.  Please enter a positive number.");
					sc.nextLine();
					continue;
				}
			}
			Circle circle1 = new Circle(radius);
			System.out.println("The circumference is: " + circle1.getFormattedCircumference() + ".");
			System.out.println("The area is: " + circle1.getFormattedArea() + ".");
			sc.nextLine();
			while (true) {
				System.out.println("Do you want to do that again? (y/n)");
				keepGoing = sc.nextLine();
				if (keepGoing.equalsIgnoreCase("y") || keepGoing.equalsIgnoreCase("n")) {
					break;
				} else {
					System.out.println("Invalid entry.  Enter a y or n");
					continue;
				}
			}
		}
		System.out.println("Goodbye.  You calculated values for " + Circle.getObjectCount() + " circles.");
		sc.close();
	}
}
