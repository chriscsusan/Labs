package movielab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieDaoImpl implements MovieDao {
	List<Movie> movies = new ArrayList<Movie>();

	public MovieDaoImpl() {
		movies.add(new Movie("Alien", "scifi"));
		movies.add(new Movie("Aliens", "scifi"));
		movies.add(new Movie("Prometheus", "scifi"));
		movies.add(new Movie("Airplane", "comedy"));
		movies.add(new Movie("Planes, Trains, and Automobiles", "comedy"));
		movies.add(new Movie("Nightmare on Elm Street", "horror"));
		movies.add(new Movie("Friday the 13th", "horror"));
		movies.add(new Movie("Child's Play", "horror"));
		movies.add(new Movie("Avengers", "action"));
		movies.add(new Movie("Captain America", "action"));
	}

	public List<Movie> getAllMovies() {
		return movies;
	}

	public List<Movie> getMoviesByCategory(String cat) {
		List<Movie> byCat = new ArrayList<>();
		for (Movie m : movies) {
			if (m.getCategory().equals(cat)) {
				byCat.add(m);
			}
		}
		return byCat;
	}

	public Set<String> getAllCategories() {
		Set<String> cats = new HashSet<>();
		for (Movie m : movies) {
			cats.add(m.getCategory());
		}
		return cats;
	}
	//
	// public boolean isValidCategory(String category){
	//
	// return true;
	// }
	//

}
