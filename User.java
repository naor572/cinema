package application;
import java.io.Serializable;


public class User implements Serializable 
{

	String firstName;
	String lastName;
	String userName;
	String password;
	String creditCard;
	boolean isAdmin;
	private static final long serialVersionUID = 1L;

	public User(String firstName, String lastName,String userName,String password, String creditCard, boolean isAdmin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName=userName;
		this.password = password;
		this.creditCard = creditCard;
		this.isAdmin = isAdmin;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "user- userName= " +userName + "firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", creditCard="
				+ creditCard + ", isAdmin=" + isAdmin ;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName=userName;
	}

}
