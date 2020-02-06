import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CreateAccountService{

	private Stage primaryStage;
	private Stage pastStage;
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public CreateAccountService(Stage pastStage)
	{
		this.pastStage = pastStage; //old stage (login)
		Stage primary = new Stage(); //new stage
		
		GridPane pane = new GridPane(); //new pane for new stage
		pane.setAlignment(Pos.CENTER);
		Button create = new Button("Create");
		create.setOnMouseClicked(event-> createAccount());
		
		HBox genderCombo = new HBox(10); //hbox to contain gender label and dropbox
		Label gen = new Label("Gender: "); //gender label
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Male",
			        "Female",
			        "Other"
			    );
		ComboBox<String> gender = new ComboBox<>(options); //gender dropbox
		gender.getSelectionModel().selectFirst();
		genderCombo.getChildren().addAll(gen,gender);
		
		
		TextField user = new TextField();
		user.setPromptText("Username");
		TextField pass = new TextField();
		pass.setPromptText("Password");
		TextField email = new TextField();
		email.setPromptText("Email");
		TextField fname = new TextField();
		fname.setPromptText("First Name");
		TextField lname = new TextField();
		lname.setPromptText("Last Name");
		
		TextField age = new TextField();
		age.setPromptText("44");
		Label ageLabel = new Label("Age: ");
		HBox ageHolder = new HBox(10);
		ageHolder.getChildren().addAll(ageLabel, age);
		
		ageHolder.requestFocus();
		
		pane.setVgap(15);
		pane.setHgap(10);
		pane.addColumn(0, email,user,pass,fname,lname,ageHolder,genderCombo,create);
		pane.setPadding(new Insets(20,20,20,20));
		
		
		primary.setTitle("Account Creation");
		
		
		primary.setScene(new Scene(pane, 500, 400));
		
		this.primaryStage = primary;
	}
	
	private void createAccount()
	{
		
		
		
	}

	
	
	
	
}
