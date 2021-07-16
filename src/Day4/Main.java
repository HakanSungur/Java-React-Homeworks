package Day4;

import java.time.LocalDate;

import Day4.Abstract.BaseCustomerManager;

import Day4.Concrete.SturbucksCustomerManager;
import Day4.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new SturbucksCustomerManager();
		customerManager.save(new Customer(1,"Hakan","Sungur",LocalDate.of(1986, 5, 5),"40728542266"));
		

}
}