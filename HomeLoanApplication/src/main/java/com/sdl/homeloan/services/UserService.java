package com.sdl.homeloan.services;

import com.sdl.homeloan.models.User;



public interface UserService {

	User loadByUserName(String userName,String password);
	User addUser(User user);
}
