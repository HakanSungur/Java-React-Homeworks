package Day5.JGoogleAuthManager;

import Day5.Entities.Concretes.Customer;

public class JGoogleAuthManager {

	public void signIn(Customer customer) {
		System.out.println("Google servisi ile giriþ yapýldý." + customer.getFirstname());
	}
	public void signUp(Customer customer) {
		System.out.println("Google hesabý ile üye olundu." + customer.getEmail());
		
	}
}
