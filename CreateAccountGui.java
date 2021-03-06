import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CreateAccountGui{

	private Stage primaryStage;

	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public CreateAccountGui()
	{

		Stage primary = new Stage(); //new stage
		
		GridPane pane = new GridPane(); //new pane for new stage
		pane.setAlignment(Pos.CENTER);
		
		Label invis = new Label();
		invis.setVisible(false);
		
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
		age.setPromptText("Age");
		
		
		//button creatoin and action
		
		
		Button create = new Button("Create");
		create.setOnMouseClicked(event-> {
		String retString = createAccount(user, pass, fname, lname,email,gender, age);
		if(!retString.equals(""))
		{
			invis.setText(retString);
			invis.setVisible(true);
		}
		else
		{
			
			try {
			invis.setText("Account Created!");
			invis.setVisible(true);
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			LoginGui obj = new LoginGui();
			Node source = (Node) (event.getSource());
			Stage sourceStage = (Stage)source.getScene().getWindow();
			sourceStage.close();
			obj.start(new Stage());
			
			
		}
		
		}	);
		
		
		
	
		pane.setVgap(15);
		pane.setHgap(10);
		pane.addColumn(0, email,user,pass,fname,lname,age,genderCombo,create, invis);
		pane.setPadding(new Insets(20,20,20,20));
		
		
		primary.setTitle("Account Creation");
		
		
		primary.setScene(new Scene(pane, 500, 400));
		
		this.primaryStage = primary;
	}
	
	
	
	//attempts to create and validate for accurate account
	private String createAccount(TextField user, TextField pass, TextField fname, TextField lname, TextField email, ComboBox<String> gender, TextField age)
	{
		int ageNum;
		try {
			ageNum = Integer.parseInt(age.getText());
		}
		catch(NumberFormatException e)
		{
			return "Age Invalid";
		}
		ProfileObject profile = new ProfileObject(user.getText(), pass.getText(), fname.getText(), lname.getText(), email.getText(), gender.getValue(), ageNum);
		
		LoginObject credentials = new LoginObject(user.getText(), pass.getText());
		AccountCreationManager accManager = new AccountCreationManager(new AccountCreationService(credentials, profile));
		return accManager.VerifyAccount();
	
	}

	
	
	
	
}
