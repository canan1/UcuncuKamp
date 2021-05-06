package inheritance;

public class Instructor extends User {
	private String video;

	public Instructor() {
		
	}
	public Instructor(String name, String surname, String mail, String id, String sifre) {
		super(name, surname, mail, id, sifre);
		// TODO Auto-generated constructor stub
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video; 
		
	}

	

}
