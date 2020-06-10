package application;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CinemaManager 
{

	protected ArrayList<Movie> movieList = new ArrayList<>(); 
	protected ArrayList<Cinema> cinemaList = new ArrayList<>();
	protected String cinemaFile = "cinema.txt"; 
	protected String movieFile = "";
	static CinemaManager cinemaManager = new CinemaManager();
	
	public CinemaManager()
	{
	}
	public static CinemaManager getCinemaManager() 
	{
		return cinemaManager;
	}
	
	protected int addCinema(String cinemaName,String address,String phoneNumber,String numofTheaters)
	{
		readCinemaFile();
		if(cinemaName.equals("") || address.equals("")  ||  phoneNumber.equals("") || numofTheaters.equals(""))
			return -1;
		for(Cinema i: cinemaList )
		{
			if(i.getCinemaName().equals(cinemaName))
			{
				return 0;
			}
		}
		cinemaList.add(new Cinema(cinemaName, address, phoneNumber, numofTheaters));
		writeCinemaList();
		return 1;	
	}
	
	@SuppressWarnings("unchecked")
	protected void readCinemaFile()
	{
		ObjectInputStream inputStream=null;
		try {
			inputStream=new ObjectInputStream(new FileInputStream(cinemaFile));
			cinemaList=(ArrayList<Cinema>) inputStream.readObject();

		} 
		catch(IOException | ClassNotFoundException e) 
		{

		}	
	}



	public void writeCinemaList()
	{	
		ObjectOutputStream outputStream=null;
		try	{

			outputStream=new ObjectOutputStream(new FileOutputStream(cinemaFile));
			outputStream.writeObject(cinemaList);

		}
		catch(IOException e) {
			
		} finally {
			try {
				outputStream.close();
			} catch (IOException e1) {
			}

		}

	}	
}
