package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}