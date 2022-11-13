package com.sdl.homeloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.EmiDetails;
import com.sdl.homeloan.repository.EmiDetailsRepository;
import com.sdl.homeloan.services.EmiDetailsService;

@Service
public class EmiDetailsServiceIMPL implements EmiDetailsService {

	@Autowired
	private EmiDetailsRepository repo;

	@Override
	public String saveEMiDetails(EmiDetails details) {
		EmiDetails save = repo.save(details);
		
		return "EMI-Details Saved";
	}

	@Override
	public EmiDetails getEMIDetails(int eid) {
		EmiDetails emiDetails = repo.findById(eid).get();
		
		return emiDetails;
	}

	@Override
	public List<EmiDetails> getAllEMIDetails() {
		List<EmiDetails> findAll = repo.findAll();
		
		return findAll;
	}

	@Override
	public EmiDetails updateEMIDetails(EmiDetails details, int eid) {
		EmiDetails emiDetails = repo.findById(eid).get();
		emiDetails.setEmiAmountMonthly(details.getEmiAmountMonthly());
		emiDetails.setNextEmiDueDate(details.getNextEmiDueDate());
		emiDetails.setPreviousEmiStatus(details.getPreviousEmiStatus());
		EmiDetails save = repo.save(details);
		
		return save;
	}
	
}
