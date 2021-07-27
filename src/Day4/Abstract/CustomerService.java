package Day4.Abstract;

import java.rmi.RemoteException;

import Day4.Entities.Customer;

public interface CustomerService {

	public void save(Customer customer) throws NumberFormatException, RemoteException; 
}
