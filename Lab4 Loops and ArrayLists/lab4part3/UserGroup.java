import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup {
	private ArrayList<User> users;

	public UserGroup() {
		users = new ArrayList<User>(); // creating an arraylist and calling it user
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void addSampleData() { // adding users to the arraylist
		users.add(new User("Sam", "  admin", "sam23"));
		users.add(new User("George", " user", "grg4"));
		users.add(new User("Penny", "  admin", "pnny3"));
		users.add(new User("Michelle", " user", "mic9"));
		users.add(new User("John", " admin", "jn67"));
		users.add(new User("David", " user", "dvd4"));
		users.add(new User("Olivera", " editor", "liv56"));
		users.add(new User("Anna", " editor", "ann7"));
		users.add(new User("Victoriya ", " editor", "vi88"));
		users.add(new User("James", " admin", "jms5"));
	}

	public User getUser(int index) { // getting the users index in the arraylist
		return users.get(index);
	}

	public void printUsernames() {
		for (User myuser : users) {
			System.out.println(myuser.getUsername() + " " + myuser.getUserType()); // printing the user's name and type
		}
	}

	public User remove(int index) { // creating remove method
		return users.remove(index);
	}

	public void removeFirstUser() { // removing the first user using index by calling the remove method
		if (users.size() < 2) {
			users.remove(users.size());
		}
	}

	public void removeLastUser() { // removig last user by index
		if (users.size() > 0) {
			users.remove(users.size() - 1);
		}
	}

	public void removeUser(String username) { // removing user by using its name(string)
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			User u = it.next();
			if (username.equals(u.getUsername())) {
				it.remove();
			}
		}
	}
}
