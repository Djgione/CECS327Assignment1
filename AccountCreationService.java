<<<<<<< HEAD

public class AccountCreationService {
	
	private String nameChecker = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ, .-'";
	private LoginObject credentials;
	private ProfileObject profile;
	
	
	public LoginObject getCredentials() {
		return credentials;
	}

	public ProfileObject getProfile() {
		return profile;
	}


	
	AccountCreationService(LoginObject credentials, ProfileObject profile)
	{	
		this.credentials = credentials;
		this.profile = profile;
	}
	
	///this checks the validity of a name by testing if it contains things such as numbers or non alphabetical chars
	public boolean checkName()
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
	public boolean checkAge()
	{
		if(profile.getAge() < 1)
			return false;
		return true;
	}
	
	//gender string check
	public boolean checkGender()
	{
		if(profile.getGender().equals("Male") || profile.getGender().equals("Female") || profile.getGender().equals("Other"))
				return true;
		return false;
	}
	
	//checking to see if username exists 
	///TODO: finish check username
	public boolean checkUsername()
	{
		
		
		
		return true;
	}
	
	//check for valid password
	//password does not contain username or name and minimum 6 characters
	public boolean checkPassword()
	{
		
		if(credentials.getPassword().contains(credentials.getUsername()))
			return false;
		else if (credentials.getPassword().contains(profile.getFirstName()) || credentials.getPassword().contains(profile.getLastName()))
			return false;
		else if (credentials.getPassword().length() < 6)
			return false;
		return true;
	}
	
	//check for valid email
	///TODO emailcheck
	public boolean checkEmail()
	{
		
		return true;
	}

	
	
}
=======
public class AccountCreationService {
	
	private String nameChecker = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ, .-'";
	private LoginObject credentials;
	private ProfileObject profile;
	
	
	public LoginObject getCredentials() {
		return credentials;
	}

	public ProfileObject getProfile() {
		return profile;
	}


	
	AccountCreationService(LoginObject credentials, ProfileObject profile)
	{	
		this.credentials = credentials;
		this.profile = profile;
	}
	
	///this checks the validity of a name by testing if it contains things such as numbers or non alphabetical chars
	public boolean checkName()
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
	public boolean checkAge()
	{
		if(profile.getAge() < 1)
			return false;
		return true;
	}
	
	//gender string check
	public boolean checkGender()
	{
		if(profile.getGender().equals("Male") || profile.getGender().equals("Female") || profile.getGender().equals("Other"))
				return true;
		return false;
	}
	
	//checking to see if username exists 
	///TODO: finish check username
	public boolean checkUsername()
	{
		
		
		
		return true;
	}
	
	//check for valid password
	//password does not contain username or name and minimum 6 characters
	public boolean checkPassword()
	{
		
		if(credentials.getPassword().contains(credentials.getUsername()))
			return false;
		else if (credentials.getPassword().contains(profile.getFirstName()) || credentials.getPassword().contains(profile.getLastName()))
			return false;
		else if (credentials.getPassword().length() < 6)
			return false;
		return true;
	}
	
	//check for valid email
	///TODO emailcheck
	public boolean checkEmail()
	{
		
		return true;
	}

	
	
}
>>>>>>> JosiahQ
