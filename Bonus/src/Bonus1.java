import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String proceed = "y";
		int grade;
		
		System.out.println("Welcome to the Letter Grade Converter!\r");
		
		while (proceed.equalsIgnoreCase("y")){
		System.out.println("Enter a numerical grade:");
		grade = scanner.nextInt();
		if (grade > 0 && grade <60){
			System.out.println("Letter Grade: F");
		}else if(grade > 59 && grade < 70){
			if (grade >= 67 && grade <= 69){
				System.out.println("Letter Grade: D+");
			}else if(grade >= 60 && grade <= 62){
				System.out.println("Letter Grade: D-");
			}else {
			System.out.println("Letter Grade: D");
			}
		}else if(grade > 69 && grade < 80){
			if (grade >= 77 && grade <= 79){
				System.out.println("Letter Grade: C+");
			}else if(grade >= 70 && grade <= 72){
				System.out.println("Letter Grade: C-");
			}else {
			System.out.println("Letter Grade: C");
			}
		}else if(grade > 79 && grade < 90){
			if (grade >= 87 && grade <= 89){
				System.out.println("Letter Grade: B+");
			}else if(grade >= 80 && grade <= 82){
				System.out.println("Letter Grade: B-");
			}else {
			System.out.println("Letter Grade: B");
			}
		}else if(grade > 89 && grade <=100){
			if (grade == 100 || grade == 99){
				System.out.println("Letter Grade: A+");
			}else if(grade >= 90 && grade <= 92){
				System.out.println("Letter Grade: A-");
			}else {
				System.out.println("Letter Grade: A");
			}
		}else {
			System.out.println("You entered an invalid score.");
		}
		System.out.println("\rContinue? (y/n)");
		proceed = scanner.next();
		}
	scanner.close();
	
	}
}


