package inheritance;

public class User {
	private String name;
	private String surname;
	private String mail;
	private String id;
	private String sifre;
	
	public User() {
		
	}
	public User(String name, String surname, String mail, String id, String sifre) {
		
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.id = id;
		this.sifre = sifre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	

}
