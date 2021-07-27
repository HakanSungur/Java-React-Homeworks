package Day4.Abstract;

import java.rmi.RemoteException;

import Day4.Entities.Customer;

public interface CustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
