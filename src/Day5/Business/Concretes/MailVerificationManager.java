package Day5.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import Day5.Business.Abstracts.VerificationService;

public class MailVerificationManager implements VerificationService {

	CustomerCheckManager customerCheckManager;
	List<String> verificatedEmails=new ArrayList<String>();
	
	@Override
	public void sendMail(String email) {
		System.out.println(email+"kullanýcýsýna doðrulama maili gönderildi.");
		
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		
	}

	@Override
	public boolean isVerificated(String email) {
		if(verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
 