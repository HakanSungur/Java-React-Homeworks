package week3;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" Öðrenci eklendi.");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" Öðrenci güncellendi.");
	}
	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+" Öðrenci silindi.");
	}
}
