package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.PersonalInfo;

@Repository
public interface PersonalInfoRepo extends JpaRepository<PersonalInfo, Integer>{

}
