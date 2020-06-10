package application;

import java.io.Serializable;

public class Theater implements Serializable

{
	private static int theaterId;
	private int numOFrows=0;
	private int numOFcols=0;
	private static final long serialVersionUID = 1L;
	
	public Theater()
	{
		Theater.theaterId ++;
	}

	public int getNumOFrows() {
		return numOFrows;
	}

	public void setNumOFrows(int numOFrows) {
		this.numOFrows = numOFrows;
	}

	public int getNumOFcols() {
		return numOFcols;
	}

	public void setNumOFcols(int numOFcols) {
		this.numOFcols = numOFcols;
	}

	public static int getTheaterId() {
		return theaterId;
	}
	
}
