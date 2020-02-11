import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;


public class LoginGui extends Application{

	public LoginGui()
	{
		
	}
	

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JesusLoversSongService");
		CreateAccountGui acc = new CreateAccountGui(primaryStage);
		Stage accountMake = acc.getPrimaryStage();
		Label username = new Label();
		Label password = new Label();
		Button btn = new Button();
		Hyperlink createAccountCaller = buildCreateAccountLink(primaryStage, accountMake);
		TextField usernameInsert = new TextField();
		TextField passwordInsert = new TextField();
		TextFlow createAccount = new TextFlow(new Text(""), createAccountCaller);
		username.setText("Username: ");
		password.setText("Password: ");
		
		btn.setText("Login");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				LoginObject credentials = new LoginObject(usernameInsert.getText(), passwordInsert.getText());
				
				
				
			}
		});

		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setVgap(15);
		root.setHgap(10);
		root.setPadding(new Insets(20,20,20,20));
		
		root.addColumn(0, username,password,btn);
		root.addColumn(1,usernameInsert,passwordInsert,createAccount);
		
		root.getChildren();
		primaryStage.setScene(new Scene(root, 500, 400));
		primaryStage.show();
	}
	
	private Hyperlink buildCreateAccountLink(Stage primaryStage, Stage accountStage)
	{
		Hyperlink ans = new Hyperlink("Create Account");
		ans.setOnAction(event-> {
			accountStage.setX(primaryStage.getX());
			accountStage.setY(primaryStage.getY());
			Node source = (Node) (event.getSource());
			Stage sourceStage = (Stage)source.getScene().getWindow();
			sourceStage.close();
			accountStage.show();
			
		});
		return ans;
	}
	
	
}	
