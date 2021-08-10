package Day5.DataAccess.Abstracts;

import java.util.List;

import Day5.Entities.Concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List <Customer> getAll();
}
