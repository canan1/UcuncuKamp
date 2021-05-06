package inheritance;

public class Student extends User {

	private int odev;
	private int yoklama;
	private int basarıOrani;

	public Student() {

	}

	public Student(String name, String surname, String mail, String id, String sifre) {
		super(name, surname, mail, id, sifre);

		// TODO Auto-generated constructor stub
	}

	public int getOdev() {
		return odev;
	}

	public void setOdev(int odev) {
		this.odev = odev;
	}

	public int getYoklama() {
		return yoklama;
	}

	public void setYoklama(int yoklama) {
		this.yoklama = yoklama;
	}

	public int getBasarıOrani() {
		return basarıOrani;
	}

	public void setBasarıOrani(int basarıOrani) {
		this.basarıOrani = basarıOrani;
	}

}
