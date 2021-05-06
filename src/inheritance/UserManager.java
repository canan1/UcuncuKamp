package inheritance;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + "kayıt alındı");

	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
