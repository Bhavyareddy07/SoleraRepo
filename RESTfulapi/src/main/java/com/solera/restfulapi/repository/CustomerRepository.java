package com.solera.restfulapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.solera.restfulapi.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
