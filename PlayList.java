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
	
	public boolean removeSong(String title)
	{
		for(Song s : list)
		{
			if(s.song.title.equals(title)) {
				list.remove(s);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("list: ");
		builder.append(list);
		builder.append(", name: ");
		builder.append(name);
		return builder.toString();
	}
	
		

}
