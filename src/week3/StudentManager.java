package week3;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" ��renci eklendi.");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" ��renci g�ncellendi.");
	}
	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+" ��renci silindi.");
	}
}
