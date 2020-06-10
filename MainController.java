package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class MainController 
{
	protected LoginView l = LoginView.getLoginView();
	protected RegisterView r = RegisterView.getRegisterView();

	@FXML
	public void Login(ActionEvent e) throws Exception  
	{	
		l.addLoginWindow();


	}

	@FXML
	public void Register(ActionEvent e) throws Exception  
	{	
		r.addRegisterWindow();

	}
	
}


/*
if (nameTxt.getText().equals("Admin") && passtxt.getText().equals("Admin"))
{
	Stage stage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/application/Admin.fxml"));
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
else if(nameTxt.getText().equals("User") && passtxt.getText().equals("User"))
{
	Stage stage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/application/User.fxml"));
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
else
{
	Alert a = new Alert(AlertType.INFORMATION);
	a.setTitle("Login Message");
	a.setHeaderText("Login Wrong");
	a.show();

}
 */