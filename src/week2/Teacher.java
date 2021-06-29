package week2;

import java.util.Date;

public class Teacher {
	
	public Teacher(int id, String name, String surname, String email, String resume, Date createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.resume = resume;
		this.createdDate = createdDate;
	}

	int id;
	
	String name;
	
	String surname;
	
	String email;
	
	String resume;
	
	Date createdDate;
	

}
