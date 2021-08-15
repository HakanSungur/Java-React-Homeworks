package Day5.Business.Concretes;


import Day5.Business.Abstracts.CustomerCheckService;
import Day5.Business.Abstracts.CustomerService;
import Day5.Business.Abstracts.VerificationService;
import Day5.Core.Abstracts.AuthService;
import Day5.DataAccess.Abstracts.CustomerDao;
import Day5.Entities.Concretes.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;
	CustomerDao customerDao;
	VerificationService verificationService;
	private AuthService authService;
	
	
	public CustomerManager(CustomerCheckService customerCheckService, CustomerDao customerDao,
			VerificationService verificationService, AuthService authService) {
		super();
		this.customerCheckService = customerCheckService;
		this.customerDao = customerDao;
		this.verificationService = verificationService;
		this.authService= authService;
	}

	
	
	@Override
	public void signUp(Customer customer) {
		if(customerCheckService.isValid(customer)==true) {
			System.out.println(customer.getFirstname()+" isimli kullan�c� sisteme eklendi.");
			verificationService.sendMail(customer.getEmail());
			customerDao.add(customer);
			this.authService.signUpToSystem(customer);
		}
		
	}

	@Override
	public void signIn(Customer customer) {
		verificationService.verifyMail(customer.getEmail());
		if(customerDao.getEmail(customer.getEmail())&& customerDao.getPassword(customer.getPassword())&& verificationService.isVerificated(customer.getEmail())==true ) {
			System.out.println("Kullan�c� giri�i ba�ar�l�.");
		}else if(verificationService.isVerificated(customer.getEmail())==false){
			System.out.println("Mail adresi kullan�lm�yor. L�tfen mail adresinizi kontrol ediniz.");
		}else {
			System.out.println("Kullan�c� giri� bilgileri yanl�� l�tfen kontrol ediniz.");
		}
		this.authService.signInToSystem(customer);
	}
	
	

	
	
}
