package com.solera.dealermanagementsystem.service;

import com.solera.dealermanagementsystem.entities.Message;

public interface HelloWorldService {
   public String getMessage(Integer id);
   public Message addMessage(Message message);
}
