package Day4.Adapters;

import java.rmi.RemoteException;

import Day4.Abstract.CustomerCheckService;
import Day4.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
KPSPublicSoapProxy client= new KPSPublicSoapProxy();
	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		if (result==true) {
			System.out.println("Doðrulama Baþarýlý.");
			
		}else {
			System.out.println("Doðrulama Baþarýsýz.");
		}
		return result;
	}

	
}
