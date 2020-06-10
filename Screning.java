package application;

import java.io.Serializable;

public class Screening implements Serializable 

{
	private static int screenId;
	private int movieId;
	private int theaterId;
	private static final long serialVersionUID = 1L;
	
	public static int getScreenId() 
	{
		return screenId;
	}
	
	public int getscreenId() 
	{
		return screenId;
	}
	
	public int getMovieId() 
	{
		return movieId;
	}

	public int getTheaterId()
	{
		return theaterId;
	}

}

