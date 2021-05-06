package inheritance;

public class StudentManager extends UserManager{

	 @Override
	public void addMultiple(User[] users) {
		super.addMultiple(users);
	}
	
		@Override
		public void add(User user) {
			System.out.println(user.getSurname() + " öğrenci eklendi.");
		//deneme
	}

}
