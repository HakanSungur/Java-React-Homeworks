package Day5.JGoogleAuthManager;

import Day5.Entities.Concretes.Customer;

public class JGoogleAuthManager {

	public void signIn(Customer customer) {
		System.out.println("Google servisi ile giri� yap�ld�." + customer.getFirstname());
	}
	public void signUp(Customer customer) {
		System.out.println("Google hesab� ile �ye olundu." + customer.getEmail());
		
	}
}
