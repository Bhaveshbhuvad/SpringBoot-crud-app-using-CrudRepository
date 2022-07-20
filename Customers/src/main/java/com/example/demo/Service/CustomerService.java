package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
       
	@Autowired
    CustomerRepository customerRepository;
	
    public void addCustomer(Customer customer) 
    {
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer()
    {
        List<Customer> customer=new ArrayList<Customer>();
        customerRepository.findAll().forEach(Customer1 -> customer.add(Customer1));
        return customer;
    }
    
    public Customer getCustomerById(int id) 
    {
        return customerRepository.findById(id).get();
    }
    
    public Customer updateCustomer(Customer customer, int id) 
    {
    	return customerRepository.save(customer);
    }
    
    public void delete(int id) {
        customerRepository.deleteById(id);;
    }

}