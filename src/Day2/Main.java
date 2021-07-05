package Day2;

import java.text.SimpleDateFormat;


import java.util.Date;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		
		Student student1 =new Student(0,2,2,"Hakan","Sungur","Ankara","hakansungur@gmail.com",36, date);
		Student student2 =new Student(1,1,2,"Engin","Demiroð","Ankara","engindemirog@gmail.com",36, date);
		Student [] students= {student1,student2};
		
		for (Student student: students) {
			
			System.out.println(student.name);
		}
		
		Category category1 =new Category(0, "Programlama");
		Category category2 =new Category(0, "Kiþisel Geliþim");
		Category [] categories = {category1,category2};
		
		for (Category category: categories) {
			
			System.out.println(category.name);
		}
	}

}
