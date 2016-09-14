package labs;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String proceed = "y";
		long fac = 1;
		
		while (proceed.equalsIgnoreCase("y")){
			System.out.println("Enter an integer from 1 to 10.");
			int num = scanner.nextInt();
			
			if (num > 0 && num <=10){
				fac = 1;
				for (int i = 1; i <= num; i++){
				fac *= i;
				}
				System.out.println("Result is:" + fac);
			}else{
				
			System.out.println("Entered number is not between 1 and 10.");
			}
			System.out.println("Continue? (y/n)");
			proceed = scanner.next();
		}
		scanner.close();
	}
}
