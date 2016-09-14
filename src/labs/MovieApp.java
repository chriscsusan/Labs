// Worked with Kyle Morris
package labs;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {
	static Movie movie;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Movie> movieList = new ArrayList<>();
		movie = new Movie("Despicable Me", "animation");
		movieList.add(movie);
		movie = new Movie("Lion King", "animation");
		movieList.add(movie);
		movie = new Movie("Aladdin", "animation");
		movieList.add(movie);
		movie = new Movie("A Few Good Men", "drama");
		movieList.add(movie);
		movie = new Movie("Titanic", "drama");
		movieList.add(movie);
		movie = new Movie("Alien", "scifi");
		movieList.add(movie);
		movie = new Movie("The Matrix", "scifi");
		movieList.add(movie);
		movie = new Movie("Inception", "scifi");
		movieList.add(movie);
		movie = new Movie("Halloween", "horror");
		movieList.add(movie);
		movie = new Movie("Nightmare On Elm Street", "horror");
		movieList.add(movie);
		String category;
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")) {

			System.out.println("Welcome to the Movie List Application!\n");
			while (true) {
				System.out.println("What category are you interested in?");
				category = scanner.next();
				if (category.equalsIgnoreCase("animation") || category.equalsIgnoreCase("horror")
						|| category.equalsIgnoreCase("scifi") || category.equalsIgnoreCase("drama")) {
					break;
				} else {
					System.out.println("Please choose from the following categories: Animation, Drama, Horror, or Scifi.");
					continue;
				}
			}

			for (Movie temp : movieList) {
				if (temp.getCategory().equalsIgnoreCase(category)) {
					//System.out.println(temp.getTitle());
					System.out.println(temp.toString());
				}
			}
			scanner.nextLine();
			while (true) {
				System.out.println("\nWould you like to go again?");
				keepGoing = scanner.next();
				if (keepGoing.equalsIgnoreCase("y") || keepGoing.equalsIgnoreCase("n")) {
					break;
				} else {
					System.out.println("Invalid entry.  Enter a y or n");
					continue;
				}
			}
		}
		System.out.println("Goodbye.");
		scanner.close();
	}
}
