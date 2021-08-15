package Day5.Core.Abstracts;

import Day5.Entities.Concretes.Customer;

public interface AuthService {

	 void signInToSystem(Customer customer); 
	 void signUpToSystem(Customer customer);
}
