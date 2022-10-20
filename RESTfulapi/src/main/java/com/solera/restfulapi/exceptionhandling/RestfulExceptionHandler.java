package com.solera.restfulapi.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.solera.restfulapi.exceptions.CustomerNotFoundException;
import com.solera.restfulapi.exceptions.OrderNotFoundException;
@RestControllerAdvice
public class RestfulExceptionHandler {
  @ExceptionHandler(CustomerNotFoundException.class)
  public ResponseEntity<String> handleCustomerNotFoundException(){
	return new ResponseEntity<String>("Customer not found", HttpStatus.NOT_FOUND);
	  
  }
  
  @ExceptionHandler(OrderNotFoundException.class)
  public ResponseEntity<String> handleOrderNotFoundException(){
		return new ResponseEntity<String>("Customer not found", HttpStatus.NOT_FOUND);
		  
}
}