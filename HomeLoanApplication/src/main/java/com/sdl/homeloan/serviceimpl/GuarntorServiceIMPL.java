package com.sdl.homeloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.exceptions.InvalidGuarantorException;
import com.sdl.homeloan.models.Guarantor;

import com.sdl.homeloan.repository.GuarntorRepository;
import com.sdl.homeloan.services.GuarntorService;

@Service
public class GuarntorServiceIMPL implements GuarntorService {
	
	@Autowired
	private GuarntorRepository repo;



	@Override
	public String insertGuarantor(Guarantor guarantor) {
		if (guarantor.getGuarantorId()>0 && guarantor.getGuarantorId()<19999&& !guarantor.getGuarantorName().isEmpty() && guarantor.getGuarantorName().length()<=10) {
			
			if (!repo.existsById(guarantor.getGuarantorId())) {
		 
				   repo.save(guarantor);
					
				    return "Guarantor Saved";		   
			}
			else {
				throw new InvalidGuarantorException();
			}
		}
		else {
			return "create record";
		}
		
	}



	@Override
	public List<Guarantor> getAllGuarantor() {
		return repo.findAll();
	}



	@Override
	public String updateGuarantor(Guarantor guarantor) {
        repo.save(guarantor);
		
		return "UPDATED";
	}



	@Override
	public Guarantor getGuarantorbyId(int guarantorId) {
        Guarantor gut = repo.findById(guarantorId).get();
		
		return gut;
	}

	

}
