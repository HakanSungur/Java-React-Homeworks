package Day4.Concrete;



import java.rmi.RemoteException;
import java.time.LocalDate;

import Day4.Abstract.CustomerService;
import Day4.Entities.Customer;

public  class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		System.out.println(customer.getFirstName()+ " isimli  m??teri eklendi. ");
		
		
	}

	

	

}
