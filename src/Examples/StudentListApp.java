/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentListApp {

	private static Student[] students = new Student[] {
			new Student("David", "Coney Island", "Hamtramck"),
			new Student("Cookie Monster", "cookies", "New York"),
			new Student("Bryan", "Byte Code", "Detroit"),
			new Student("James", "franks", "Detroit Area"),
			new Student("Chelsea", "Pizza", "Ann Arbor") };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean isContinue = true;
		while (isContinue) {
			Student student;

			printAllStudents();
			System.out.println("Select a student by number.");
			try {
				int studentNumber = scanner.nextInt();
				int studentIndex = studentNumber - 1;
				student = students[studentIndex];
			} catch (InputMismatchException e) {
				scanner.next(); // clear the bad scanner input
				System.out.println("You must enter a number between 1 and " + students.length);
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("You must enter a number between 1 and " + students.length);
				continue;
			}
			scanner.nextLine();

			System.out.println("Ok. That's " + student.getName() + ". Would you like to know hometown or favorite food?");
			String infoType = scanner.nextLine();
			try {
				String info = student.getInformation(infoType);
				System.out.println(student.getName() + "'s " + infoType + " is " + info + ".");
			} catch (IllegalArgumentException ex) {
				System.out.println("Sorry. That information is not available.");
			}

			System.out.println("Would you like to learn about another student? (y/n)");
			String yesOrNo = scanner.next();
			isContinue = yesOrNo.equalsIgnoreCase("Y");
		}
		
		System.out.println("Farewell.");
		scanner.close();
	}

	private static void printAllStudents() {
		for (int i = 0; i < students.length; i++) {
			System.out.println((i + 1) + ". " + students[i].getName());
		}
	}

}

