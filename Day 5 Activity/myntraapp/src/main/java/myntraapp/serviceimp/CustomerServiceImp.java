package myntraapp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myntraapp.bean.Customer;
import myntraapp.repositary.MyLocalRepository;
import myntraapp.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	MyLocalRepository myLocalRepository;
	
	
	public Customer addCustomer(Customer customer) {
		
		Customer addcustomer = myLocalRepository.save(customer);
		
		return addcustomer;
	}

	
	public List<Customer> getAllListOfCustomers() {
		
		
		List<Customer> listOfcustomers = myLocalRepository.findAll();
		
		return listOfcustomers;
	}

	
	public Customer updateCustomer(Customer customer, long id) {
		
		customer.setId(id);
		
		Customer updatedcustomer = myLocalRepository.save(customer);
		return updatedcustomer;
	}



	}


