package Day4.GameStroeProject.Adapters;

import java.rmi.RemoteException;

import Day4.GameStroeProject.Abstract.UserCheckService;
import Day4.GameStroeProject.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
KPSPublicSoapProxy client= new KPSPublicSoapProxy();
	
	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		
		boolean result= client.TCKimlikNoDogrula(Long.parseLong(user.getNationaltyId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());
		if (result==true) {
			System.out.println("Doðrulama Baþarýlý.");
			
		}else {
			System.out.println("Doðrulama Baþarýsýz.");
		}
		return result;
	}

	
}
