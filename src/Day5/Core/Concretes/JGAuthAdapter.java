package Day5.Core.Concretes;

import Day5.Core.Abstracts.AuthService;
import Day5.Entities.Concretes.Customer;
import Day5.JGoogleAuthManager.JGoogleAuthManager;

public class JGAuthAdapter implements AuthService {

	JGoogleAuthManager gAuthManager=new JGoogleAuthManager();
	
	@Override
	public void signInToSystem(Customer customer) {
		gAuthManager.signIn(customer);
		
	}

	@Override
	public void signUpToSystem(Customer customer) {
		gAuthManager.signUp(customer);
		
	}

	
	
}
