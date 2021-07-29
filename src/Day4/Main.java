package Day4;


import java.rmi.RemoteException;
import java.time.LocalDate;

import Day4.Adapters.MernisServiceAdapter;
import Day4.Concrete.BaseCustomerManager;
import Day4.Concrete.StarbucksCustomerManager;
import Day4.Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,RemoteException{
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		//kendi bilgilerinizi girerek deneyebilirsiniz. 
		customerManager.save(new Customer(1,"Hakan","Sungur",LocalDate.of(1986, 5, 5),"44444442266"));
		

}
}