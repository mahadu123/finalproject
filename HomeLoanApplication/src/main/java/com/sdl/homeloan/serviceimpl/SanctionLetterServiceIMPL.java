
package com.sdl.homeloan.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.SanctionLetter;
import com.sdl.homeloan.repository.SanctionLetterRepository;
import com.sdl.homeloan.services.SanctionLetterService;
@Service
public class SanctionLetterServiceIMPL implements SanctionLetterService
{
	@Autowired
	private SanctionLetterRepository repo;
	
	@Override
	public void createSanctionLetter(SanctionLetter sl) {
		repo.save(sl);
		System.out.println("SanctionLetter inserted through service");
		
	}

	@Override
	public SanctionLetter getSanctionletter(int slid) {
		Optional<SanctionLetter> optional=repo.findById(slid);
		if(optional.isPresent())
			return optional.get();
		
		else
			
		return null;
		
		
	}

	
}
