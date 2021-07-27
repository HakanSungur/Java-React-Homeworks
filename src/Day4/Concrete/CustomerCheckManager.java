package Day4.Concrete;

import Day4.Abstract.CustomerCheckService;

import Day4.Entities.Customer;


public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	

}
