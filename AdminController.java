package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AdminController 
{

	private AdminView adminView = AdminView.getAdminView();
	private Admin adminModel = Admin.getAdmin();
	private AddCinemaView addCinemaView = AddCinemaView.getAddCinemaView();
	

	@FXML
	public void deleteUserPress(ActionEvent e)
	{
		adminModel.deleteUser(adminView.deleteUserPress(adminModel.getUserNameList()));

	}
	
	@FXML
	public void addCinemaWindow(ActionEvent e) throws IOException
	{
		addCinemaView.addCinemaWindow();

	}




}
