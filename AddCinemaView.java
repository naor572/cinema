package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddCinemaView extends AdminView
{
	protected Stage stageAddCinema;
	static AddCinemaView addCinemaView= new AddCinemaView();
	
	public static AddCinemaView getAddCinemaView() 
	{
		return addCinemaView;
	} 
	
	protected void addCinemaWindow() throws IOException
	{
		Parent logIn = FXMLLoader.load(MainController.class.getResource("/application/AddRemoveCinema.fxml"));
		stageAddCinema = new Stage();
		stageAddCinema.initModality(Modality.APPLICATION_MODAL);
		stageAddCinema.initOwner(stageAdmin);
		Scene scene = new Scene(logIn);
		stageAddCinema.setScene(scene);
		stageAddCinema.showAndWait();

	}
	
	protected void showMessage(String msg)
	{
		Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("Add Cinema Message");
		a.setHeaderText(msg);
		a.show();
	}
	
}