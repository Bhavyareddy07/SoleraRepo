package com.solera.dealermanagementsystem.dao;

import java.util.Optional;

import com.solera.dealermanagementsystem.entities.Message;

public interface HelloWorldRepository extends CrudRepository<Message, Integer> {

	Message save(Message message);

	Optional<Message> findById(Integer id);
	
	
	
	
}