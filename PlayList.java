import java.util.ArrayList;

public class PlayList {
	
	private ArrayList<Song> list;
	
	public ArrayList<Song> getList() {
		return list;
	}


	public PlayList()
	{
		list = new ArrayList<Song>();
	}
	
	public void addSong(Song song)
	{
		list.add(song);
	}
	
	
	public boolean removeSong(Song song)
	{
		return list.remove(song);
	}

}
