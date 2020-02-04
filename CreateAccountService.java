import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateAccountService{

	private Stage primaryStage;
	private Stage pastStage;
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public CreateAccountService(Stage pastStage)
	{
		this.pastStage = pastStage;
		Stage primary = new Stage();
		
		GridPane pane = new GridPane();
		
		Label username = new Label("Username: ");
		Label password = new Label("Password: ");
		Label fname = new Label("First Name: ");
		Label lname = new Label("Last Name: ");
		Label email = new Label("Email: ");
		Label age = new Label("Age: ");
		Label gender = new Label("Gender: ");
		
		
		pane.addColumn(0, email,username,password,fname,lname,age,gender);
		pane.setVgap(15);
		pane.setHgap(10);
		pane.setPadding(new Insets(20,20,20,20));
		
		primary.setTitle("Account Creation");
		
		
		primary.setScene(new Scene(pane, 800, 550));
		
		this.primaryStage = primary;
	}

	
	
	
	
}
