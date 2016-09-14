package labs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Batter {
	public DecimalFormat number = new DecimalFormat("0.000");
	String name;
	public ArrayList<Integer> atBats = new ArrayList<Integer>();

	public Batter(String name) {
		this.name = name;
	}

	public double getBattingAverage() {
		ArrayList<Integer> currentList = new ArrayList<Integer>();
		for (int i : atBats) {
			if (i > 0 && i < 5) {
				currentList.add(i);
			}
		}
		return (double) currentList.size() / (double) atBats.size();
	}
	
	public void setBases(int bases){
		this.atBats.add(bases);
	}

	public String getName() {
		return this.name;
	}

	public String formatNumber(double x) {
		return number.format(x);
	}

	public double getSluggingPercentage() {
		int totalBases = 0;
		for (Integer i : atBats) {
			totalBases += i;
		}
		return ((double) totalBases / (double) atBats.size());
	}

	public void setAtBatResults(Scanner sc) {
		String answer = "y";
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
			setBases(Validator.getInt(sc, "Result for at-bat:", 0, 4));
			
			answer = another(sc);
		}
	}
	
	public String another(Scanner sc){
		System.out.println("Another at-bat?");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
			return "y";
		}else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
			return "n";
		}else{
			System.out.println("That is not a valid choice.");
			another(sc);
		}
		return "y";
	}
}
