import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DashboardGui {

	private ProfileObject prof;
	
	public DashboardGui(ProfileObject prof)
	{
		this.prof = prof;
	}
	
	public ProfileObject getProf() {
		return prof;
	}
	
	private void addPlaylist()
	{
		
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Playlist Creator");
		TextField name = new TextField("Playlist Name");
		HBox playlist = new HBox(10);
		Button add = new Button("Create");
		Button cancel = new Button("Cancel");
		playlist.getChildren().addAll(add,cancel);
		
		cancel.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent event)
			{
				primaryStage.close();
				Start();
			}
			
		});
		
		add.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event)
			{
				PlayList added = new PlayList(name.getText());
				prof.getPlaylists().add(added);
				primaryStage.close();
				Start();
			}
			
		});
		
		
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setVgap(15);
		root.setHgap(10);
		root.setPadding(new Insets(20,20,20,20));
		root.addColumn(0,name, playlist);
		root.getChildren();
		primaryStage.setScene(new Scene(root, 300, 150));
		primaryStage.show();
		
		
	}

	public void Start()
	{
		
		
		Stage primary = new Stage();
		ObservableList<String> playlists = FXCollections.observableArrayList();
		ObservableList<Song> songs = FXCollections.observableArrayList();
		
		for(int i = 0; i < prof.getPlaylists().size(); i++)
		{
			playlists.add(prof.getPlaylists().get(i).getName());
		}
		
		ComboBox<String> listPlaylist = new ComboBox<>(playlists);
		
		//button for song functions
		HBox songButtons = new HBox(10);
		Button addSong = new Button("Add to Playlist");
		Button playSong = new Button("Play Song");
		songButtons.getChildren().addAll(addSong, playSong);
		
		//buttons for playlist functions
		HBox playlistButtons = new HBox(10);
		
		Button editPlaylist = new Button("Edit");
		Button addPlaylist = new Button("New Playlist");
		playlistButtons.getChildren().addAll(editPlaylist,addPlaylist);
		

		addPlaylist.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override
			public void handle(ActionEvent event)
			{
				addPlaylist();
				primary.close();
			}
			
		});
		
		
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setVgap(15);
		pane.setHgap(10);
		pane.setPadding(new Insets(20,20,20,20));
		pane.addColumn(0, songButtons);
		pane.addColumn(1,listPlaylist, playlistButtons);
		pane.getChildren();
		
		primary.setScene(new Scene(pane, 500, 700));
		primary.show();
	}
	
	
}
