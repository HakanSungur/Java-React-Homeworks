package week3;

public class InstructorManager extends UserManager {

	
	
	@Override
	public void add(User user){
		System.out.println(user.getFirstName()+" isimli E�itmen eklendi.");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+"isimli E�itmen g�ncellendi.");
	}
	
	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+" isimli E�itmen silindi.");
	}
	
	
}
