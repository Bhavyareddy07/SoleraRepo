package com.solera.collegeservice.exceptions.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.solera.collegeservice.exceptions.CollegeNotFoundException;
import com.solera.collegeservice.exceptions.StudentNotFoundException;

@RestControllerAdvice
public class CollegeServiceExceptionHandler {
	
	@ExceptionHandler(CollegeNotFoundException.class)
	public ResponseEntity<String> handleCollegeNotFoundException(){
		return new ResponseEntity<String>("College not found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotFoundException(){
		return new ResponseEntity<String>("Student not found",HttpStatus.NOT_FOUND);
	}
}
