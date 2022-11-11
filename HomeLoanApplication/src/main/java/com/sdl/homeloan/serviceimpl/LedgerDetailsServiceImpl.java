package com.sdl.homeloan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.Ledger;
import com.sdl.homeloan.models.LoanDetails;
import com.sdl.homeloan.repository.LedgerDetailsRepository;
import com.sdl.homeloan.repository.LoanDetailsRepo;
import com.sdl.homeloan.services.LedgerDetailsService;
import com.sdl.homeloan.services.LoandetailsService;

@SuppressWarnings("unused")
@Service
public class LedgerDetailsServiceImpl implements LedgerDetailsService{

	@Autowired
	private LedgerDetailsRepository repo;
	
	@Override
	public Ledger ledgerDetailsInsert(Ledger l) {
		
		return repo.save(l);
	}

	@Override
	public Ledger ledgerView(int ledgerId) {
		Ledger ledger = repo.findById(ledgerId).get();
		return ledger;
	}


	


}
