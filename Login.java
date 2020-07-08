package application;


public class Login extends UserManagement
{
	static Login login = new Login();

	private Login()
	{
		super();
	}


	public static Login getLogin()
	{
		return login;
	}
	protected int authentication(String userName,String passWord)
	{
		readUsers();
		for(User i :users)
		{
			if (i.getUserName().equals(userName))
			{
				if(i.getPassword().equals(MD5.getMd5(passWord))) 
				{
					if(i.isAdmin())
					{
						return 1;
					}
					else
					{
						currentUser = i;
						return -1;
					}
				}
				return 2;
			}
		}
		return 0;
	}
}





/*
	protected boolean findUser()
	{

		for(User i :users)
		{
			if (i.getFirstName().equals(this.getFirstName()) && i.getlastName().equals(this.getlastName())&&i.getPassword().equals(this.getPassword()))
				return true;
			}

		return false;
	}
 */


/*
 * 
 * 

	public void writeUser(List<User>users)
	{	
		users.add(new User(firstName,lastName,password,creditCard,isAdmin));
			ObjectOutputStream outputStream=null;
		try	{

		outputStream=new ObjectOutputStream(new FileOutputStream(filename));
		outputStream.writeObject(users);

	}
		catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

	}

	}	
 */


