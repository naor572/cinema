package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddCinemaController 
{
	@FXML
	private TextField cinemaName;
	@FXML
	private TextField address;
	@FXML
	private TextField phoneNumber;
	@FXML
	private TextField numOfTheaters;
	private CinemaManager cinemaManagerModel = CinemaManager.getCinemaManager();
	private AddCinemaView addCinemaView = AddCinemaView.getAddCinemaView();
	private AddTheaterView addTheaterView = AddTheaterView.getAddTheaterView();
	
	@FXML
	public void addCinemaPress(ActionEvent e) throws IOException
	{
	
		int flag = cinemaManagerModel.addCinema(cinemaName.getText(),address.getText(),phoneNumber.getText(),numOfTheaters.getText());
		switch(flag)
		{
		case 1: addTheaterView.addTheaterWindow();
		break;
		case 0: addCinemaView.showMessage("The Cinema Curremt Exist");
		break;
		case -1 : addCinemaView.showMessage("Please Enter Details");
		break;
		default:
			break;
		}	
	}

}
