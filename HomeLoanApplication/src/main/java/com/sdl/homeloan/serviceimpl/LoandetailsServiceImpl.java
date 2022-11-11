package com.sdl.homeloan.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.LoanDetails;
import com.sdl.homeloan.repository.LoanDetailsRepo;
import com.sdl.homeloan.services.LoandetailsService;

@SuppressWarnings("unused")
@Service
public class LoandetailsServiceImpl implements LoandetailsService{
	@Autowired
	private LoanDetailsRepo repo ;

	@Override
	public LoanDetails loanDeatilsInsert(LoanDetails l) {
		return repo.save(l);
	
		
	}

	@Override
	public LoanDetails loanView(int loanId) {
		 LoanDetails id = repo.findById(loanId).get();
		return id;
	}

}
