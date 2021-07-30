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
			System.out.println(user.getFirstName() + " isimli kullanýcý sisteme eklendi.");
		}else {
			System.out.println("Hatalý bir bilgi giriþi nedeniyle kullanýcý eklenemedi.");
		}
		
	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName()+ "oyuncu bilgileri güncellendi.");
		
	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName()+ "oyuncu bilgileri silindi.");
		
	}

}
