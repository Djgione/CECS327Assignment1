
///Class used to store the username and password of a user, to check for login credentials and create initial account
public class LoginObject {

	private String username; //username
	private String password; //password
	
	public LoginObject(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
