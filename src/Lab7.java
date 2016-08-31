import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[] { "ChrisS", "Kyle", "Narmatha", "Mumeen", "Tenica", "Sadia", "James", "ChrisD",
				"Mark", "Yolanda", "Brent", "Krafus", "Ashlei", "Purba", "David", "Bryan", "Thomas", "Keesha", "Nurah",
				"Robert" };

		String[] hometown = new String[] { "Royal Oak", "Detroit", "West Bloomfield", "Detroit", "Detroit",
				"Farmington Hills", "Highland Park", "Macomb", "Redford", "Detroit", "Sagnasty", "Detroit",
				"Southfield", "Detroit", "Farminton Hills", "Hamtramck", "Rochester", "Detroit", "Detroit", "Detroit",
				"Sterling Heights" };
		String[] favoriteFood = new String[] { "Chocolate", "Turkey Burgers", " Cucumber", "Potato", "Pizza",
				"watermelon", "Franks", "Pizza", "lo-mein ", "Asparagus", "Taco", "Salmon", "Veggie Wraps", "apples",
				"grape", "Oatmel", "Ziti", "Smoothies", "Salmon", "Ice cream" };
		System.out.println("Welcome to our java class!");

		Scanner scanner = new Scanner(System.in);
		int studentIndex;
		String choice = ("y");
		String answer = "";

		while (choice.equals("y")) {
			listNames(name);
			System.out.println("Which student would you like to learn more about?");
			try {
				studentIndex = scanner.nextInt()-1;
				System.out.println("Student " + (studentIndex+1) + " is " + name[studentIndex]);

			} catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
				System.out.println("You have entered an invalid number.  Please choose from 1-20.");
				continue;
			} catch (InputMismatchException ex) {
				System.out.println("You have entered an invalid response.  Please choose a number from 1-20.");
				scanner.next();
				continue;
			}
			scanner.nextLine();
			while (true) {
				System.out.println("What would you like to learn about another person? (Hometown or favorite food)");
				answer = scanner.nextLine();
				if (answer.equalsIgnoreCase("hometown")) {
					System.out.println(name[studentIndex] + " is from " + hometown[studentIndex]);
					break;
				} else if (answer.equalsIgnoreCase("favorite food")) {
					System.out.println(name[studentIndex] + "'s favorite food is " + favoriteFood[studentIndex]);
					break;
				} else {
					System.out.println("Please choose from the two options that were presented.");
				}

			}

			System.out.println("Do you want to choose another person?");
			choice = scanner.next();
		}
		scanner.close();
		System.out.println("Goodbye.");
	}
	public static void listNames(String[] name){
		for (int i = 0; i < name.length; i++) {
			System.out.println(i + 1 + " " + name[i]);
		}
		
		return;
	}

}
