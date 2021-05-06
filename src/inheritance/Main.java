package inheritance;

public class Main {

	public static void main(String[] args) {
		Instructor ınstructor = new Instructor();
		ınstructor.setId("6778");
        ınstructor.setName("engil");
        ınstructor.setSurname("demiroğ");
        ınstructor.setSifre("689");
        ınstructor.setMail("linkedin.com/in/engindemirog");
        ınstructor.setVideo("https://www.youtube.com/watch?v=v0nc0yesGfk") ;
       
        
	
      Student student = new Student();
      student.setName("canan");
      student.setSurname("aykan");
      student.setId("90");
      student.setBasarıOrani(69);
      student.setSifre("8990");
      student.setYoklama(10);
      student.setMail("canan.aykan12@gmail.com");
     StudentManager studentManager= new StudentManager();
     studentManager.add(student);
     InstructorManager instructorManager = new InstructorManager();
     instructorManager.dersVideo(ınstructor);
     instructorManager.add(ınstructor);
	}
}
