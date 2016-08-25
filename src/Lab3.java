import java.util.Scanner;

public class Lab3 {
	
	public static void main(String[] args) {

        
        Scanner scanner = new Scanner (System.in);
        
        String Green = "y";
        
        while (Green.equalsIgnoreCase("y")){
            System.out.println("Learn your squares and cubes!");
            System.out.println("Enter an integer:__");
            int Number = scanner.nextInt();
            
            System.out.println("Number\tSquared\tCubed");
            System.out.println("=======\t=======\t======");
            for (int i = 1; i <= Number; i++){
            
            System.out.println(i + "\t" + Math.pow(i,  2) +  "\t" + Math.pow(i,  3));
            }
            System.out.println("Continue? (y/n):");
            Green = scanner.next();
        }
        scanner.close();
    }

}
