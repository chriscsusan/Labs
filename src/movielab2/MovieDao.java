package movielab2;

import java.util.List;
import java.util.Set;

public interface MovieDao {
	
	List<Movie> getAllMovies();
	
	List<Movie> getMoviesByCategory(String cat);
//	
	Set<String> getAllCategories();
//	
//	boolean isValidCategory(String category);

}