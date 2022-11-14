package com.sdl.homeloan.services;

import com.sdl.homeloan.models.Guarantor;


import java.util.List;


public interface GuarntorService {
	
	String insertGuarantor(Guarantor guarantor);

	List<Guarantor> getAllGuarantor();

	String updateGuarantor(Guarantor guarantor);

	Guarantor getGuarantorbyId(int guarantorId);

}
