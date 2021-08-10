package Day5.Business.Concretes;


import Day5.Business.Abstracts.CustomerCheckService;
import Day5.Business.Abstracts.CustomerService;
import Day5.Business.Abstracts.VerificationService;
import Day5.DataAccess.Abstracts.CustomerDao;
import Day5.Entities.Concretes.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;
	CustomerDao customerDao;
	VerificationService verificationService;
	
	
	@Override
	public void signUp(Customer customer) {
		if(customerCheckService.isValid(customer)==true) {
			System.out.println(customer.getFirstname()+" isimli kullanýcý sisteme eklendi.");
			verificationService.sendMail(customer.getEmail());
			customerDao.add(customer);
		}
		
	}

	@Override
	public void signIn(Customer customer) {
		verificationService.verifyMail(customer.getEmail());
		if(customerDao.getEmail(customer.getEmail())&& customerDao.getPassword(customer.getPassword()))
	}

	
}
