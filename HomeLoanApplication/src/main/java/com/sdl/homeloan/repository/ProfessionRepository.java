package com.sdl.homeloan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.Profession;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Integer> {
	

}
