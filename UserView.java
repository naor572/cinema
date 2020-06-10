package application;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UserView extends LoginView
{
	protected Stage stageUser;
	static UserView userView=new UserView();
	
	
	protected void addUserWindow() throws IOException
	{
		Parent logIn = FXMLLoader.load(MainController.class.getResource("/application/User.fxml"));
		stageUser = new Stage();
		stageUser.initModality(Modality.APPLICATION_MODAL);
		stageUser.initOwner(loginStage);
		Scene scene = new Scene(logIn);
		stageUser.setScene(scene);
		stageUser.showAndWait();
	}

	public static UserView getUserView() {
		return userView;
	}
}
