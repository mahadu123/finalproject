package com.sdl.homeloan.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sdl.homeloan.exceptions.CustomerNotFoundException;

@RestControllerAdvice
public class CustomerDetailsException {


	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> custNotFound() {
		return new ResponseEntity<String>("Customer Not Found",HttpStatus.NOT_FOUND);
	}

}
