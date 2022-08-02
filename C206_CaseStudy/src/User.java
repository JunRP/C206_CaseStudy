public class User {
	
	
	private String name;
	private String password;
	private String emailAddress;
	private String status;
	private String role;
	
	public User(String name, String password, String emailAddress, String status, String role)
	{
		this.name = name;
		this.password = password;
		this.emailAddress = emailAddress;
		this.status = status;
		this.role = role;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
				
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	
	
}