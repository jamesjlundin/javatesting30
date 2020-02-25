import java.util.*;

public class User {
	//members - methods and properties
	
	private String firstName;
	private String lastName;
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public String output() {
			return "Hi my name is " + getFullName() + ".";
	}
	public String output(boolean nice) {
		if(nice) {
			return "Hey " + getFullName() + "! You are the best!";
		} else {
			return "You are a freak. -  " + getFullName() + ".";
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fn) {
		firstName = fn.trim();
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String ln) {
		lastName = ln.trim();
	}
	public static void printUsers(List<User> users) {
		for(User u : users) {
			System.out.println(u.getFullName());
		}
	}
	
	public static User findUser(List<User> users, User u) {
		for(User user : users) {
			if(user.equals(u)) {
				return user;
			}
		}
		return null;
	}
	public static int searchList(List<User> users, User u) {
		return searchList(users, u.getFullName());
	}
	public static int searchList (List<User> users,String fn, String ln) {
		return searchList(users, fn + " " + ln);
	}
	public static int searchList (List<User> users, String fullName) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getFullName().contentEquals(fullName)) {
				return i;
			}
		}
		return -1;
	}
	public static void changeCrap(User x) {
		x.setFirstName("Changed");
	}

	@Override
	public String toString() {
		return "User [getFullName()=" + getFullName() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
}