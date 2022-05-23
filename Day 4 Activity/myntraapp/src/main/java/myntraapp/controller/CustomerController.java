package myntraapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import myntraapp.bean.Customer;
import myntraapp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService; 
	
	@PostMapping(value="addcustomer")
	Customer addCustomer(@RequestBody Customer customer) {
		
		Customer cust = customerService.addCustomer(customer);
		
		return cust;
		
	}
}
