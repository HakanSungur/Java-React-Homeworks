package Day4.GameStroeProject.Concrete;

import java.rmi.RemoteException;


import Day4.GameStroeProject.Abstract.UserCheckService;
import Day4.GameStroeProject.Abstract.UserService;
import Day4.GameStroeProject.Entities.User;

public class UserManager implements UserService {
	
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
		}
	
	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " isimli kullan�c� sisteme eklendi.");
		}else {
			System.out.println("Hatal� bir bilgi giri�i nedeniyle kullan�c� eklenemedi.");
		}
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName()+ "oyuncu bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName()+ "oyuncu bilgileri silindi.");
		
	}

}
