package week3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" isimli kullanýcý eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" isimli kullanýcý güncellendi.");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+" isimli kullanýcý silindi.");
	}

	
	
}
