import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.search.Song;
import com.google.gson.*;

public class SearchService {
	public SearchService() {}
	
	public int Search(String input) {
		Gson gson = new Gson();
		FileReader fr;
		BufferedReader br;	
		try {
			fr = new FileReader("C:/Users/pjipa/OneDrive/DOCUME~1-Aurora-9011/CECS 327/Project 1 v2/src/music.json");
			br = new BufferedReader(fr);
			Song[] result = gson.fromJson(br, Song[].class);
			
			for(int i = 0; i < 10000; i++);
			{
				System.out.print(result);
				result = gson.fromJson(br, Song[].class);
			}			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		
		return 0;
		
		/*public int Search(String input) {
			JSONParser parser = new JSONParser();
			
			try {
				FileReader fr;
				fr = new FileReader("C:/Users/pjipa/OneDrive/DOCUME~1-Aurora-9011/CECS 327/Project 1 v2/src/music.json");
				Object obj = parser.parse(fr);			
				JSONArray jsonArray = (JSONArray) obj;
				JSONObject jsonObj;

				String songName;
				
				for(int i = 0; i < jsonArray.size(); i++) {
					jsonObj = (JSONObject) jsonArray.get(i);
					System.out.println(jsonArray.get(i));
					
					songName = (String) jsonObj.get("name");
					System.out.println("song: " + songName);
					if(input == songName) {
						return (int) jsonObj.get("id");	
					}
				}

				//System.out.println(jsonArray.get(1));
				//System.out.println("Song: " + iterator.next());
				//JSONObject jsonObj = (JSONObject) obj;
				
				//String name = (String) jsonArray.get("name");
				//System.out.println("Name is: " + name);
				
				//String location = (String) jsonArray.get("location");
				//System.out.println("Location is: " + location);
				
				System.out.println("Success");
				fr.close();
			}
				
			catch(Exception e){
				e.printStackTrace();
			}
			
			return 0;*/
	}
}