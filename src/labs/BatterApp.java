package labs;

import java.util.ArrayList;
import java.util.Scanner;

public class BatterApp {

	public static void main(String[] args) {
		ArrayList<Batter> batters = new ArrayList<Batter>();
		Scanner sc = new Scanner(System.in);
		String newBatter = "y";

		System.out.println("Welcome to the Batting Average Calculator!\n");
		int i = 0;
		while (newBatter.toLowerCase().startsWith("y")) {
			System.out.println("Enter the player's name:");
			batters.add(new Batter(sc.nextLine()));
			batters.get(i).setAtBatResults(sc);
			
			System.out.println("Do you want to enter stats for another player?");
			newBatter = sc.next().toLowerCase();
			i++;
			sc.nextLine();
		}
		for (Batter temp : batters) {
			System.out.println("Name: " + temp.getName());
			System.out.println("Batting average: " + temp.formatNumber(temp.getBattingAverage()));
			System.out.println("Slugging percentage: " + temp.formatNumber(temp.getSluggingPercentage()));
			System.out.println(temp.atBats);
		}
	}

}
