package week3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" isimli kullanıcı eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" isimli kullanıcı güncellendi.");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+" isimli kullanıcı silindi.");
	}

	
	
}
