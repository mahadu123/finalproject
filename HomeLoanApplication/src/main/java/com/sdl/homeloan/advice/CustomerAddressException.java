package com.sdl.homeloan.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sdl.homeloan.exceptions.IDNotFoundException;

@RestControllerAdvice
public class CustomerAddressException {
	
	@ExceptionHandler(value = IDNotFoundException.class)
	public ResponseEntity<String> addressNotFound(){
		return new ResponseEntity<String>("Address Not Found",HttpStatus.BAD_REQUEST);
		
	}

}
