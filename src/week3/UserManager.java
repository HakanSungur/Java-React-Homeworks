package week3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� g�ncellendi.");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+" isimli kullan�c� silindi.");
	}

	
	
}
