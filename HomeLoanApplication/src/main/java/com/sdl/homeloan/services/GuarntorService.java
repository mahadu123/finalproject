package com.sdl.homeloan.services;

import com.sdl.homeloan.models.Guarntor;

import java.util.List;


public interface GuarntorService {
	
	String insertGuarantor(Guarntor guarantor);

	List<Guarntor> getAllGuarantor();

	String updateGuarantor(Guarntor guarantor);

	Guarntor getGuarantorbyId(int guarantorId);

}
