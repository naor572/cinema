package cinema;

import java.io.Serializable;
import java.util.Date;

public class movieInfo implements Serializable
{
	private static final long serialVersionUID=1L;
	private static int movieId;
	private int theaterId;
	private Date date;
	private String catgory;

	public movieInfo(int theaterId, Date date, String catgory) 
	{
		
		this.theaterId = theaterId;
		this.date = date;
		this.catgory = catgory;
	}

	public static int getMovieId() 
	{
		return movieId;
	}

	public int getTheaterId() 
	{
		return theaterId;
	}


	public Date getDate() 
	{
		return date;
	}


	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}


	public String toString()
	{
		return "[theaterId=" + theaterId + ",date=" + date + ", catgory=" + catgory+"]";
	}
	
	
}
