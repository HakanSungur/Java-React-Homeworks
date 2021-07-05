package Day2;

import java.util.Date;

public class Course {

	
	
	public Course(int id, int categoryId, int teacherId, String name, String detail, Date createdDate) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.teacherId = teacherId;
		this.name = name;
		this.detail = detail;
		this.createdDate = createdDate;
	}
	int id;
	int categoryId;
	int teacherId;
	String name;
	String detail;
	Date createdDate;
	
}
