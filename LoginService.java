public class LoginService {

	private LoginObject credentials;
	
	public LoginService(LoginObject credentials)
	{
		this.credentials = credentials;
	}

	public LoginObject getCredentials() {
		return credentials;
	}
	
	public ProfileObject checkCredentials()
	{
		
		if(LoginGui.accounts.accountArray.length == 0)
			return null;
		for(ProfileObject prof : LoginGui.accounts.accountArray){
			if(credentials.getUsername().equals(prof.getUsername())){
				if(credentials.getPassword().equals(prof.getPassword()))
					return prof;
			}
		}
		return null;
	}
}