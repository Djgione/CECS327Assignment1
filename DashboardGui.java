import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
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

	public void Start()
	{
		
		
		
		
		
		
		
		
		//button for song functions
		HBox songButtons = new HBox();
		Button addSong = new Button("Add to Playlist");
		Button playSong = new Button("Play Song");
		songButtons.getChildren().addAll(addSong, playSong);
		
		//buttons for playlist functions
		HBox playlistButtons = new HBox();
		Button editPlaylist = new Button("Edit");
		Button addPlaylist = new Button("New Playlist");
		playlistButtons.getChildren().addAll(editPlaylist,addPlaylist);
		
		
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setVgap(15);
		pane.setHgap(10);
		pane.addColumn(0, songButtons);
		pane.addColumn(1, playlistButtons);
		pane.getChildren();
		Stage primary = new Stage();
		primary.setScene(new Insets(pane, 20, 20, 20, 20));
	}
	
	
}
