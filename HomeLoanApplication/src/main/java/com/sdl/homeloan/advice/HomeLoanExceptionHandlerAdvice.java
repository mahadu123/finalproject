package com.sdl.homeloan.advice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.sdl.homeloan.exceptions.InvalidGuarantorException;
import com.sdl.homeloan.exceptions.UserNotFoundException;

@RestControllerAdvice
public class HomeLoanExceptionHandlerAdvice {

	@ExceptionHandler(value = UserNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorMessage handleUserNotFoundException(UserNotFoundException ex, WebRequest request) {
		return new ErrorMessage(
				HttpStatus.BAD_REQUEST.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false)
			);
	}
	
	@ExceptionHandler(InvalidGuarantorException.class)
	public ResponseEntity<String> nameinvalidException() {
		
	return new ResponseEntity<String>("Add correct credentials",HttpStatus.BAD_REQUEST);
	}


}
