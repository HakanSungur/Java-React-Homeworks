package Day5.Business.Abstracts;

import Day5.Entities.Concretes.Customer;

public interface CustomerService {

	void signUp(Customer customer);
	void signIn(Customer customer);
}
