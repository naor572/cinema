package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddTheaterView  extends AddCinemaView
{
		protected Stage stageAddTheater;
		static AddTheaterView addTheaterView= new AddTheaterView();


		public static AddTheaterView getAddTheaterView() 
		{
			return addTheaterView;
		}


		protected void addTheaterWindow() throws IOException
		{
			Parent logIn = FXMLLoader.load(MainController.class.getResource("/application/AddTheaters.fxml"));
			stageAddTheater = new Stage();
			stageAddTheater.initModality(Modality.APPLICATION_MODAL);
			stageAddTheater.initOwner(stageAddCinema);
			Scene scene = new Scene(logIn);
			stageAddTheater.setScene(scene);
			stageAddTheater.showAndWait();

		}
	}

