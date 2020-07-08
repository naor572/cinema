package application;

import java.util.ArrayList;
import java.util.Iterator;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Admin extends UserManagement
{
	static Admin admin = new Admin();
	public static Admin getAdmin() 
	{
		return admin;
	}
	private Admin()
	{
		readUsers();
	}
 
	protected void deleteUser(String userName)
	{
		if(userName.equals(""))
			return;
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getUserName().equals(userName))
			{
				users.get(i).deleteOrders();
				CinemaManager.getCinemaManager().writeCinemaList();
				CinemaManager.getCinemaManager().readCinemaFile();
				users.remove(i);
				writeUsers();
				return;
			}   
		}
	}
	/*
		for(Iterator<User> i = users.iterator(); i.hasNext();) 
		{
			if(i.next().getUserName().equals(userName))
			{
				i.next().deleteOrders();
				i.remove();
				writeUsers();
				CinemaManager.cinemaManager.writeCinemaList();
			}           
		}
	}
	 */

	protected ArrayList<String> getUserNameList() 
	{
		ArrayList<String> names = new ArrayList<String>();
		readUsers();
		for(User i :users)
		{
			if(i.isAdmin()==false)
				names.add(i.getUserName());
		}
		return names;
	}



}
