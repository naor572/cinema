package application;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema extends CinemaManager implements Serializable
{
	protected String cinemaName;
	protected String address;
	protected String phoneNumber;
	protected int numofTheaters;
	protected  ArrayList<Theater> theaterList= new ArrayList<>();
	protected  ArrayList<Screening> screenlist=new ArrayList<>();
	private static final long serialVersionUID = 1L;

	public Cinema(String cinemaName,String address,String phoneNumber,String numofTheaters)
	{
		this.cinemaName = cinemaName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.numofTheaters = Integer.parseInt(numofTheaters);
		for(int i=1 ;i<=this.numofTheaters;i++)
		{
			theaterList.add(new Theater());
		}
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getNumofTheaters() {
		return numofTheaters;
	}

	public void setNumofTheaters(int numofTheaters) {
		this.numofTheaters = numofTheaters;
	}


	public ArrayList<Theater> getTheaterList() {
		return theaterList;
	}

	public void setTheaterList(ArrayList<Theater> theaterList) {
		this.theaterList = theaterList;
	}

	public ArrayList<Screening> getScreenlist() {
		return screenlist;
	}

	public void setScreenlist(ArrayList<Screening> screenlist) {
		this.screenlist = screenlist;
	}

}
