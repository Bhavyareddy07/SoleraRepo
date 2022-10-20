package com.solera.restfulapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.solera.restfulapi.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
