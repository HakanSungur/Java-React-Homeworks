package Day5.Business.Abstracts;

import Day5.Entities.Concretes.Customer;

public interface CustomerCheckService {

	boolean checkFirstname(Customer customer);
	boolean checkLastname(Customer customer);
	boolean checkEmail(Customer customer);
	boolean checkPassword(Customer customer);
	boolean uniqueEmail(Customer customer);
	boolean isValid(Customer customer);
}
