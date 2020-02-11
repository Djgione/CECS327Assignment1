public class LoginService {

	private LoginObject credentials;
	
	public LoginService(LoginObject credentials)
	{
		this.credentials = credentials;
	}

	public LoginObject getCredentials() {
		return credentials;
	}
	
	public boolean checkCredentials()
	{
		
		///TODO search for username, and check against password
<<<<<<< HEAD
		
	}
	
}
=======
		return true;
	}
	
}
>>>>>>> JosiahQ
