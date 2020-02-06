
public class AccountCreationValidationService {
	
	private String nameChecker = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ, .-'";
	private LoginObject credentials;
	private ProfileObject profile;
	
	public LoginObject getCredentials() {
		return credentials;
	}

	public ProfileObject getProfile() {
		return profile;
	}


	
	AccountCreationValidationService(LoginObject credentials, ProfileObject profile)
	{	
		this.credentials = credentials;
		this.profile = profile;
	}
	
	///this checks the validity of a name by testing if it contains things such as numbers or non alphabetical chars
	public boolean CheckName()
	{
		for(int i = 0; i < profile.getFirstName().length(); i++)
		{
			boolean contains = false;
			for(int j = 0; j < nameChecker.length(); j++) 
			{
				if(profile.getFirstName().charAt(i)==nameChecker.charAt(j))
				{
					contains = true;
					break;
				}
			}
			if(contains == false)
				return contains;
		}
		
		for(int i = 0; i < profile.getLastName().length(); i++)
		{
			boolean contains = false;
			for(int j = 0; j < nameChecker.length(); j++) 
			{
				if(profile.getLastName().charAt(i)==nameChecker.charAt(j))
				{
					contains = true;
					break;
				}
			}
			if(contains == false)
				return contains;
		}
		return true;
	}
	
	//simple check for valid age
	public boolean CheckAge()
	{
		if(profile.getAge() < 1)
			return false;
		return true;
	}
	
	//gender string check
	public boolean CheckGender()
	{
		if(profile.getGender().equals("Male") || profile.getGender().equals("Female") || profile.getGender().equals("Other"))
				return true;
		return false;
	}
	
	//checking to see if username exists 
	///TODO: finish check username
	public boolean CheckUsername()
	{
		
		
		
		return true;
	}
	

	
	
}
