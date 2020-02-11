public class LoginManager {

	private LoginService service;

	public LoginManager(LoginService service) {
		this.service = service;
	}
	

	public LoginService getService() {
		return service;
	}

	public boolean handle()
	{
		return service.checkCredentials();
	}
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> JosiahQ
