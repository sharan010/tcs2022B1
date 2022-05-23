package myntraapp.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myntraapp.bean.Customer;
import myntraapp.repositary.MyLocalRepository;
import myntraapp.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	MyLocalRepository myLocalRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		Customer customeradded = myLocalRepository.save(customer);
		
		return customeradded;
	}

}
