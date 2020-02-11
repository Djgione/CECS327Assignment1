import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class AccountDatabase {
	ProfileObject[] accountArray;
	
	//initialize using json strings in account file
	public AccountDatabase(){
		Gson gson = new Gson();
		StringBuilder accountsJson = new StringBuilder();
		try(Stream<String> stream = Files.lines(Paths.get("accounts.json"), StandardCharsets.UTF_8)){
			stream.forEach(s -> accountsJson.append(s).append("\n"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		String accounts = accountsJson.toString();
		accountArray = gson.fromJson(accounts, ProfileObject[].class);
		if(accountArray == null){
			accountArray = new ProfileObject[0];
		}
	}
	
	public void addAccount(ProfileObject acc){
		//add to new array (done to avoid working with arraylists in gson)
		ProfileObject[] newArr = new ProfileObject[accountArray.length + 1];
		for(int i = 0; i < newArr.length - 1; i++){
			newArr[i] = accountArray[i];
		}
		newArr[newArr.length - 1] = acc;
		accountArray = newArr;
		//update json file w/ new account
		Gson gson = new Gson();
		String json = gson.toJson(accountArray);
		try{
			FileWriter writer = new FileWriter("accounts.json");
			writer.write(json);
			writer.close();
		}catch(Exception e){
			System.out.println("you messed up");
		}
	}
	
	public void updateAccount(ProfileObject acc){
		for(ProfileObject prof : accountArray){
			if(prof.getUsername().equals(acc.getUsername())){
				prof = acc;
				break;
			}
		}
		//update json
		Gson gson = new Gson();
		String json = gson.toJson(accountArray);
		try{
			FileWriter writer = new FileWriter("accounts.json");
			writer.write(json);
			writer.close();
		}catch(Exception e){
			System.out.println("you messed up");
		}
	}
}
