package Day5.Business.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Day5.Business.Abstracts.CustomerCheckService;
import Day5.Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	List <String> emails =new ArrayList<String>();
	@Override
	public boolean checkFirstname(Customer customer) {

		if(customer.getFirstname().isEmpty()) {
			System.out.println("�sim alan� bo� b�rak�lamaz.");
			return false;
		}else {
			if(customer.getFirstname().length()<3) {
				System.out.println("�sim 2 karakterden k����k olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastname(Customer customer) {
		if(customer.getFirstname().isEmpty()) {
			System.out.println("Soyisim alan� bo� b�rak�lamaz.");
			return false;
		}else {
			if(customer.getFirstname().length()<3) {
				System.out.println("Soyisim 2 karakterden k����k olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if(customer.getEmail().isEmpty()) {
			System.out.println("Email alan� bo� ge�ilemez.");
			return false;
			
		}else {
			if(pattern.matcher(customer.getEmail()).find()==false) {
				System.out.println("Girelen mail adresi formata uygun de�il.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(Customer customer) {

		if (customer.getPassword().isEmpty()) {
			System.out.println("�ifre bo� ge�ilemez.");
			return false;
		}else {
			if(customer.getPassword().length()<6) {
				System.out.println("�ifre 6 karakterden k���k olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(Customer customer) {

		boolean result=true;
		if(emails.contains(customer.getEmail())) {
			System.out.println("Bu mail adresi daha �nce kullan�lm��.");
			result = false;
			
		}else {
			emails.add(customer.getEmail());
		}
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {

		if(checkFirstname(customer)&& checkLastname(customer)&& checkPassword(customer)
				&& uniqueEmail(customer)==true) {
			return true;
		}
		return false;
	}

}
