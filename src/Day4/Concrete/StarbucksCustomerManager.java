package Day4.Concrete;
import java.rmi.RemoteException;

import Day4.Abstract.BaseCustomerManager;
import Day4.Abstract.CustomerCheckService;
import Day4.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Hatalý Kullýnýcý Giriþi");
		}
	}
}
