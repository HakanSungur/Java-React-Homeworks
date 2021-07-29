package Day4.GameStroeProject.Abstract;
import java.rmi.RemoteException;

import Day4.GameStroeProject.Entities.User;

public interface UserCheckService {

	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException;
	
}
