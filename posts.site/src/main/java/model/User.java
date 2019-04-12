package model;

public class User {
	private int User_id;
	private String User_name;
	private String First_name;
	private String Last_name;
	private String Email;
	private String password;

	public User() {
		super();
	}

	public User(int user_id, String user_name, String first_name, String last_name, String email, String password) {
		super();
		User_id = user_id;
		User_name = user_name;
		First_name = first_name;
		Last_name = last_name;
		Email = email;
		this.password = password;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [User_id=" + User_id + ", User_name=" + User_name + ", First_name=" + First_name + ", Last_name="
				+ Last_name + ", Email=" + Email + ", password=" + password + "]";
	}

}
