package com.sdl.homeloan.services;

import java.util.List;

import com.sdl.homeloan.models.EmiDetails;

public interface EmiDetailsService {

	String saveEMiDetails(EmiDetails details);

	EmiDetails getEMIDetails(int eid);

	List<EmiDetails> getAllEMIDetails();

	EmiDetails updateEMIDetails(EmiDetails details, int eid);
	
	
	
	

}
