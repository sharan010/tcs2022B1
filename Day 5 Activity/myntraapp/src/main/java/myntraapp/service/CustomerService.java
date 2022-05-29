package myntraapp.service;

import java.util.List;

import myntraapp.bean.Customer;

public interface CustomerService {

	Customer addCustomer(Customer customer);
	
	List<Customer> getAllListOfCustomers();
	
	Customer updateCustomer(Customer customer, long id);
}
