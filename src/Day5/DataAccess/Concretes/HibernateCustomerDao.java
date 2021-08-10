package Day5.DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import Day5.DataAccess.Abstracts.CustomerDao;
import Day5.Entities.Concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers=new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer) {
		customers.add(customer);
		System.out.println("Hibernate ile eklendi : " +customer.getFirstname());
		
		
	}

	@Override
	public void update(Customer customer) {
		
		
	}

	@Override
	public void delete(Customer customer) {
		
		
	}

	@Override
	public boolean getEmail(String email) {
		for (Customer customer: customers) {
			if(customer.getEmail()==email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for (Customer customer: customers) {
			if (customer.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Customer> getAll() {
		
		return customers;
	}

}
