package Day5.Business.Abstracts;

public interface VerificationService {

	void sendMail(String email);
	void verifyMail(String email);
	boolean isVerificated(String email);
	
}
