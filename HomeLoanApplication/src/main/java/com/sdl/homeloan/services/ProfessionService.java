package com.sdl.homeloan.services;

import java.util.List;

import com.sdl.homeloan.models.Profession;

public interface ProfessionService {

	String saveProfessionInfo(Profession profession);
	List<Profession> getAll();
	String deleteById(int pid);
	Profession updateById(Profession profession,int pid);
	

	

}
