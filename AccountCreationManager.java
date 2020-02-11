
public class AccountCreationManager {

	private AccountCreationValidationService service;
	
	AccountCreationManager(AccountCreationValidationService service)
	{
		this.service = service;
	}

	public AccountCreationValidationService getService() {
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
