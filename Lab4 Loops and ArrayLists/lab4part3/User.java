public class User {
	private String username;  // declaring instance variables
	private String userType;
	private String name;

	public User(String fj3, String editor, String Francis) {
		username = fj3;      
		userType= editor;  
		name = Francis;
	}

	public String getUsername() {  // creating a method that takes strings and returns the username of the user
		return username;
	}

	public String getUserType() { // creating a method that takes strings and returns the type of the user(ex. admin)
	return userType;
	}

	public String getName() { //creating method that takes the user's name
		return name;
	}

	public void setUserType() {  // setting user type
		

	}

}