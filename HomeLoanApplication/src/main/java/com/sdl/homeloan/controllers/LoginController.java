package com.sdl.homeloan.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	@PostMapping("/addUser")
	public ResponseEntity<User> adduser(@RequestBody User user) {
		User addUser = service.addUser(user);
		return new ResponseEntity<User>(addUser,HttpStatus.OK);
	}
	
	@GetMapping("/v1/login")
	public ResponseEntity<LoginResponse> loadByUserName(@RequestBody LoginRequest login){
		LOGGER.info("Login api started for User:"+login.getUserName()+""+login.getPassword());
		
		User user = service.loadByUserName(login.userName, login.password);
		if(null == user) {
			throw new UserNotFoundException("User Not found");
		}
		LoginResponse loginResponse= new LoginResponse("Log in successfully");
		LOGGER.info("Successfully logged in User:"+user.getUserName()+""+user.getPassword());
		return new ResponseEntity<LoginResponse>( loginResponse, HttpStatus.ACCEPTED);
	}

}
