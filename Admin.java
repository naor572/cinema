package application;

import java.util.ArrayList;
import java.util.Iterator;

public class Admin extends UserManagement
{
	static Admin admin = new Admin();

	public static Admin getAdmin() 
	{
		return admin;
	}


	protected void deleteUser(String userName)
	{
		if(userName.equals(""))
			return;
		for(Iterator<User> i = users.iterator(); i.hasNext();) 
		{
			if(i.next().getUserName().equals(userName))
			{
				i.remove();
				writeUsers();
			}           
		}
	}

	protected ArrayList<String> getUserNameList() 
	{
		ArrayList<String> names = new ArrayList<String>();
		readUsers();
		for(User i :users)
		{
			if(i.isAdmin==false)
				names.add(i.getUserName());
		}
		return names;
	}
}