package com.sdl.homeloan.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.dto.LoginRequest;
import com.sdl.homeloan.dto.LoginResponse;
import com.sdl.homeloan.exceptions.UserNotFoundException;
import com.sdl.homeloan.models.User;
import com.sdl.homeloan.services.UserService;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	
	@Autowired
	private UserService service;
	
	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);
	
	
	@RequestMapping("/v1/login")
	public ResponseEntity<LoginResponse> loadByUserName(@RequestBody LoginRequest login){
		LOGGER.info("Login api started for User:"+login.getUserName());
		
		User user = service.loadByUserName(login.getUserName());
		if(null == user) {
			throw new UserNotFoundException("User Not found");
		}
		LoginResponse loginResponse= new LoginResponse("Log in successfully");
		LOGGER.info("Successfully logged in User:"+user.getUserName());
		return new ResponseEntity<LoginResponse>( loginResponse, HttpStatus.ACCEPTED);
	}

}
