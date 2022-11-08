package com.sdl.homeloan.serviceimpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.User;
import com.sdl.homeloan.repository.UserRepository;
import com.sdl.homeloan.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public User loadByUserName(String userName) {
		LOGGER.info("User service loadByUserName " + userName);

		User user = userRepo.findByUserName(userName);
		if (null != user) {
			LOGGER.info("User found in databse " + user.getUserName());
		} else {
			LOGGER.error("User Not found in databse " + userName);
		}
		return user;
	}

}
