package cinema;

import java.util.Date;

public class seat
{
	private int row;
	private int col;
	private boolean available = true;

	
	public seat(int row, int col) 
	{
		this.row=row;
		this.col=col;
	}

	public int getRow() 
	{
		return row;
	}

	public int getCol()
	{
		return col;
	}

	public boolean isAvailable()
	{
		return available;
	}
	
	
}