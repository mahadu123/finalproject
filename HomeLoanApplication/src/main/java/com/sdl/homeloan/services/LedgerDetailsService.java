package com.sdl.homeloan.services;

import com.sdl.homeloan.models.Ledger;

public interface LedgerDetailsService {

	Ledger ledgerDetailsInsert(Ledger l);

	Ledger ledgerView(int ledgerId);
	
}


