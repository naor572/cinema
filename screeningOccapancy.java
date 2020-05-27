package cinema;

import java.util.Date;
import java.util.List;

public class screeningOccapancy 
{
	private static int screenId;
	private List <seat> listOfseat;
	private int numofAvailableSeats;
	private boolean fullScreening = false;
	

	
	public void screeningOccapancy(int row,int col)
	{
		for (int i =1 ; i<=row;i++)
		{
			for (int j =1 ; j<=col;j++)
			{
				listOfseat.add(new seat(i,j));
			}
		}
		this.numofAvailableSeats=row*col;
	}
	
	public seat findSeat(int row, int col)
	{
		for(seat i :listOfseat)
		{
			if(i.getRow()==row && i.getCol()==col)
			{
				return i;
			}	
		}
		return null;
	}
	
	
	public boolean checkSeat(int row,int col)
	{
			if(findSeat( row,  col).isAvailable())
			{
				return true;
			}
			return false;	
	}
	

	
	
}