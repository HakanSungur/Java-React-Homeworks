package week2;

import java.util.Date;

public class Student {
	
	
	public Student(int id, int registeredCourseId, int finishedCourseId, 
			String name, String surname,
			String adress, String email, int age, Date createdDate) {
		super();
		this.id = id;
		this.registeredCourseId=registeredCourseId;
		this.finishedCourseId=registeredCourseId;
	
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.email = email;
		this.age = age;
		this.createdDate = createdDate;
	}
	
	int id;
	int registeredCourseId;
	int finishedCourseId;
	String name;
	String surname;
	String adress;
	String email;
	int age;
	Date createdDate;
	
	

	
}
