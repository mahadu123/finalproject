package com.sdl.homeloan.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.models.Guarantor;
import com.sdl.homeloan.models.GuarantorDTO;

public interface GurantorService {



	String insertGuarantor(GuarantorDTO dto);

	List<Guarantor> getAllGuarantor();

	String updateGuarantor(Guarantor guarantor);

	Guarantor getGuarantorbyId(int guarantorId);

	void setDocument(int guarantorId, MultipartFile f1);

	

	

}
