package Day4.GameStroeProject.Abstract;

import java.rmi.RemoteException;

import Day4.GameStroeProject.Entities.User;

public interface UserService {

	public void add (User user) throws NumberFormatException, RemoteException;
	public void update(User user)throws NumberFormatException, RemoteException;
	public void delete (User user)throws NumberFormatException, RemoteException;
}
