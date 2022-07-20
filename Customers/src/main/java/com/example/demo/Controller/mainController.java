
package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class mainController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer()
	{
		return customerService.getAllCustomer();
	}
	
	@PostMapping("/customer")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
		return customer;
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") int id) 
	{
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/customer/{id}")
	public Customer update(@RequestBody Customer customer,@PathVariable("id") int id) 
	{
		customerService.updateCustomer(customer, id);
		return customer;
	}
	
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable("id")int id) {
		customerService.delete(id);
		return "Done";
	}
}

