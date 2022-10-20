package com.solera.restfulapi.service;

import com.solera.restfulapi.entities.Customer;
import com.solera.restfulapi.exceptions.CustomerNotFoundException;

public interface CustomerService {
public Customer createCustomer(Customer customer) ;
public Customer retrieveCustomer(Integer customerId) throws CustomerNotFoundException;
public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

public String deleteCustomer(Integer customerId) throws CustomerNotFoundException;
	
}
