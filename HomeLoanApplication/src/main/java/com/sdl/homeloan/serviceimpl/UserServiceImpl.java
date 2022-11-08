package com.sdl.homeloan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.User;
import com.sdl.homeloan.repository.UserRepository;
import com.sdl.homeloan.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User loadByUserName(String userName) {

		User user = userRepo.findByUserName(userName);
		return user;
	}

}
