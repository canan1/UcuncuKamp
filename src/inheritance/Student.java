package inheritance;

public class Student extends User {

	private int odev;
	private int yoklama;
	private int basar�Orani;

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

	public int getBasar�Orani() {
		return basar�Orani;
	}

	public void setBasar�Orani(int basar�Orani) {
		this.basar�Orani = basar�Orani;
	}

}
