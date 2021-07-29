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
			System.out.println("Do�rulama Ba�ar�l�.");
			
		}else {
			System.out.println("Do�rulama Ba�ar�s�z.");
		}
		return result;
	}

	
}
