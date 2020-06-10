package cinema;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class movie implements Serializable

{


private String name;
private String catgory;
private List <movieInfo> infoList;
private static final long serialVersionUID=1L;


public movie(String name, String catgory) 
{
	this.name = name;
	this.catgory = catgory;
}

public String getName() 
{
	return this.name;
}


public List<movieInfo> getlInfo()
{
	return this.infoList;
}


public String getCatgory() 
{
	return this.catgory;
}


public void addMovieInfo(int theaterId, Date date, String catgory)
{
	this.infoList.add(new movieInfo(theaterId,date,catgory));
}

public void removeMovieInfo(int movieId)
{
	
	this.infoList.remove(search(movieId));
}


public movieInfo search(int movieId)
{
	
	for(int i=0;i<(infoList.size());i++)
	{
		if(infoList.get(i).getMovieId()==movieId)
		{
			return infoList.get(i);
		}
	}
	System.out.println("ID NOT EXIST");
	return null;
	????
}

}
