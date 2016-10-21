package movielab2;

import org.junit.Assert;
import org.junit.Test;

public class MovieDaoTest {
	
	MovieDao dao = new MovieDaoImpl();
	@Test
	
	public void allMoviesShouldReturn10Movies(){
		Assert.assertEquals(10, dao.getAllMovies().size());
	}
	
	@Test
	public void theFirstMovieIsAlien(){
		Assert.assertEquals("Alien", dao.getAllMovies().get(0).getTitle());
		Assert.assertEquals("scifi", dao.getAllMovies().get(0).getCategory());
		
	}

	@Test
	public void threeMoviesInScifi(){
		Assert.assertEquals(3, dao.getMoviesByCategory("scifi").size());
	}
	
	@Test
	public void yetAnotherTest(){
		
	}
}
