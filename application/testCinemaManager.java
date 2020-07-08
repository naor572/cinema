package application;
import org.junit.Before;
import org.junit.Test;
import application.Cinema;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.Date;



public class testCinemaManager {
	CinemaManager C= CinemaManager.getCinemaManager();
	
	@Before
    public void before()
	{
		ArrayList<Movie> movielist = new ArrayList<>();
		C.setMovieList(movielist);
		//C= new CinemaManager(movielist);
	}

	 
	
	@Test
    public void testMakeDate()
	{
		assertNotNull("need to make new date",C.makeDate(2000,5,30,12,5,3));
	}

	@Test
    public void testgetMovieListByCategory()
    {
		C.getMovieList().add(new Movie("nemo","Comedy","for all the family","fish"));
		C.getMovieList().add(new Movie("harryPoter","Horror","for all the family","magic"));
		C.getMovieList().add(new Movie("mazeRunner","Horror","for all family","maze"));
		assertEquals("the number of comedy movie need to be 1",1,C.getMovieListByCategory("Comedy").size());
		assertEquals("the number of horror movie need to be 2",2,C.getMovieListByCategory("Horror").size());
    }

	
	@Test
	public void testAddMovie() {
		C.getMovieList().add(new Movie("nemo","Comedy","for all the family","fish"));
		assertEquals("when the user forgot to insert data on one of the field we need to get -1 ",-1,C.addMovie("nemo","","",""));
		assertEquals("if the movie is exist in the movie list we need to get 0 ",0,C.addMovie("nemo","comedy","for all the famliy","fish"));
		assertEquals("if the movie is not exist in the movie list we need to get 1 ",1,C.addMovie("harryPoter","Horror","for all the famliy","magic!"));
	}

	
	@Test
	public void testoverrideMovie()
	{
		Movie m=new Movie("nemo","","","");
		C.overrideMovie(m,"comedy","for all the family","ff");
		assertEquals("check that it set category in movie object",m.getCategory(),"comedy");
		
	}

	
	@Test
	public void testDeleteMovie()
	{
		C.getMovieList().add(new Movie("nemo","Comedy","for all the family","fish"));
		assertEquals("after we add one movie to list we have one ",1,C.getMovieList().size());
		C.deleteMovie("nemo");
		assertEquals("after we delete the movie we have zero movie in list ",0,C.getMovieList().size());
		
	}
	

}
