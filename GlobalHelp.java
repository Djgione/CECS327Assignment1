
public class GlobalHelp {

	private static final GlobalHelp INSTANCE = new GlobalHelp();
	
	public static GlobalHelp getInstance() {
		return INSTANCE;
	}

	public AccountDatabase getAccounts() {
		return accounts;
	}

	public void setAccounts(AccountDatabase accounts) {
		this.accounts = accounts;
	}

	private volatile AccountDatabase accounts = new AccountDatabase();
	
}
