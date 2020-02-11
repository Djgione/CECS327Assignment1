import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.google.gson.Gson;
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
	public Song[] songArray;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JesusLoversSongService");
		
		/** how to play a song asynchronously **/
		MusicService player = new MusicService();
		new Thread(new Runnable() {
			public void run() {
				player.mp3play("imperial.mp3");
				
			}
		}).start();
		
		//create an array of Song objects by parsing the json data in 'music.json' with gson
		Gson gson = new Gson();
		StringBuilder songsJson = new StringBuilder();
		try(Stream<String> stream = Files.lines(Paths.get("music.json"), StandardCharsets.UTF_8)){
			stream.forEach(s -> songsJson.append(s).append("\n"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		String songs = songsJson.toString();
		songArray = gson.fromJson(songs, Song[].class);
		
		
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
				System.out.println("Hello World!");
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
