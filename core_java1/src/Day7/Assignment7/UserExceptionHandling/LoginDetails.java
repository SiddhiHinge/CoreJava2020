package Day7.Assignment7.UserExceptionHandling;

public class LoginDetails {

	String username = "Admin";
	String password = "admin123";
	
	public LoginDetails() {  }

	public LoginDetails(String username, String password) {
		super();
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

	@Override
	public String toString() {
		return "LoginDetails\nUsername = " + username + " , Password = " + password;
	}
	
	
}
