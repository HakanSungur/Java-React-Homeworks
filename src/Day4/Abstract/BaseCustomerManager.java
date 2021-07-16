package Day4.Abstract;



import java.time.LocalDate;

import Day4.Entities.Customer;

public  class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) {
		
		System.out.println(customer.getFirstName()+ " isimli  müþteri eklendi. ");
		
		
	}

	

	

}
