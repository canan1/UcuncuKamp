package inheritance;

public class Main {

	public static void main(String[] args) {
		Instructor �nstructor = new Instructor();
		�nstructor.setId("6778");
        �nstructor.setName("engil");
        �nstructor.setSurname("demiro�");
        �nstructor.setSifre("689");
        �nstructor.setMail("linkedin.com/in/engindemirog");
        �nstructor.setVideo("https://www.youtube.com/watch?v=v0nc0yesGfk") ;
       
        
	
      Student student = new Student();
      student.setName("canan");
      student.setSurname("aykan");
      student.setId("90");
      student.setBasar�Orani(69);
      student.setSifre("8990");
      student.setYoklama(10);
      student.setMail("canan.aykan12@gmail.com");
     StudentManager studentManager= new StudentManager();
     studentManager.add(student);
     InstructorManager instructorManager = new InstructorManager();
     instructorManager.dersVideo(�nstructor);
     instructorManager.add(�nstructor);
	}
}
