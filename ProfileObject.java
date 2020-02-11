import java.util.List;

///class to store other info on an account, used to pull profile from json and to create accounts
public class ProfileObject {

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private int age;
	private List<PlayList> playlists; 
	

	public ProfileObject(String username, String password, String firstName, String lastName, String email, String gender, int age) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPlaylists(List<PlayList> playlists)
	{
		this.playlists = playlists;
	}
	public List<PlayList> getPlaylists()
	{
		return playlists;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("firstName: ");
		builder.append(firstName);
		builder.append(", lastName: ");
		builder.append(lastName);
		builder.append(", email: ");
		builder.append(email);
		builder.append(", gender: ");
		builder.append(gender);
		builder.append(", age: ");
		builder.append(age);
		builder.append(", playlists: ");
		builder.append(playlists);
		return builder.toString();
	}
	

	
}
