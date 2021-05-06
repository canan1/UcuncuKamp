package inheritance;

public class InstructorManager extends UserManager {

	
	@Override
	public void addMultiple(User[] users) {
		// TODO Auto-generated method stub
		super.addMultiple(users);
	}

	@Override
	public void add(User user) {
		
		
		System.out.println(user.getMail()+" eklenmiþtir.");
		
	}
	public void dersVideo(Instructor instructor) {
		System.out.println("ders videosu: "+ instructor.getVideo());
	}
	
	}
	

