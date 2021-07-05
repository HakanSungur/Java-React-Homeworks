package week3;

public class InstructorManager extends UserManager {

	
	
	@Override
	public void add(User user){
		System.out.println(user.getFirstName()+" isimli Eðitmen eklendi.");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+"isimli Eðitmen güncellendi.");
	}
	
	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+" isimli Eðitmen silindi.");
	}
	
	
}
