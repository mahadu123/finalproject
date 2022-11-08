package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);

}
