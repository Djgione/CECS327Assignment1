
public class AccountCreationManager {

	private AccountCreationService service;
	
	AccountCreationManager(AccountCreationService service)
	{
		this.service = service;
	}

	public AccountCreationService getService() {
		return service;
	}
	
	///TODO: finish calling all methods
	public String VerifyAccount()
	{
		
		if(!service.checkUsername())
			return "Username Invalid";
		else if(!service.checkAge())
			return "Age Invalid";
		else if(!service.checkGender())
			return "Gender Invalid";
		else if(!service.checkName())
			return "Name Invalid";
		else if(!service.checkPassword())
			return "Password Invalid";
		else
			return "";
		
	}
}
