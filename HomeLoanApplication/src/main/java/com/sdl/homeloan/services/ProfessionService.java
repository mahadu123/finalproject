package com.sdl.homeloan.services;

import java.util.List;

import com.sdl.homeloan.dto.ProfessionalDetails;
import com.sdl.homeloan.models.Profession;

public interface ProfessionService {

	String saveProfessionInfo(Profession profession);
	List getAll();
	String deleteById(int pid);
	Profession updateById(Profession profession,int pid);
	

	String saveSalarySlip(ProfessionalDetails details);

}
