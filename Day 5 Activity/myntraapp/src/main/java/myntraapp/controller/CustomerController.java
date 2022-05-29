package myntraapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import myntraapp.bean.Customer;
import myntraapp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService; 
	
	@PostMapping(value="createcustomer")
	Customer createCustomer(@RequestBody Customer customer) {
		
		Customer cust = customerService.addCustomer(customer);
		System.out.println(" customer ->>>> " + cust.getCustomername());
		System.out.println(" city ->>>> " + cust.getCustomercity());
		
		return cust;
		
	}
	
	@GetMapping(value = "/viewallofcustomer")
	List<Customer> viewAllListOfCustomer() {
		
		return customerService.getAllListOfCustomers();
		
	}
	@PutMapping(value="/updatecustomer/{id}")
	Customer updateCustomer(@RequestBody Customer updatecustomer, @PathVariable long id) {
		
		Customer updatedDetails = customerService.updateCustomer(updatecustomer, id);
		
		return updatedDetails;
	}
	
}

	

