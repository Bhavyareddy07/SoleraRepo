package com.solera.dealermanagementsystem.service;

import java.util.Optional;

import com.solera.dealermanagementsystem.dao.HelloWorldRepository;
import com.solera.dealermanagementsystem.entities.Message;

public class HelloWorldServiceImpl implements HelloWorldService {

	private HelloWorldRepository repository;

	@Override
	public String getMessage(Integer id) {
		Optional<Message> message = repository.findById(id);
		return message.get().getMessage();
	}

	@Override
	public Message addMessage(Message message) {
		return repository.save(message);
		
	}

}
