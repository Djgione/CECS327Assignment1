import java.util.ArrayList;

public class PlayList {
	
	private ArrayList<Song> list;
	private String name;
	
	public ArrayList<Song> getList() {
		return list;
	}


	public PlayList(String name)
	{
		list = new ArrayList<Song>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
