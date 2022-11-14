package com.sdl.homeloan.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.LoanDisbursement;
import com.sdl.homeloan.repository.LoanDisbrusmentRepo;
import com.sdl.homeloan.services.LoanDisbrumentService;

@Service
public class LoanDisbrusmentServieImpl implements LoanDisbrumentService {
	
	@Autowired
	private LoanDisbrusmentRepo repo;

	@Override
	public Object inserdata(LoanDisbursement l) {
		
		return repo.save(l);
	}

	@Override
	public Object view(int agreementid) {
	Optional<LoanDisbursement> id = repo.findById(agreementid);
	LoanDisbursement disbursement = id.get();
		return disbursement;
	}

}
