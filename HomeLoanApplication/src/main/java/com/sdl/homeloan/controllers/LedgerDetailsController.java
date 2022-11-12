package com.sdl.homeloan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.Ledger;
import com.sdl.homeloan.models.LoanDetails;
import com.sdl.homeloan.services.LedgerDetailsService;

@RestController
@RequestMapping("/LedgerInfo")

public class LedgerDetailsController  {
	
	@Autowired
	private LedgerDetailsService service;
	
	@PostMapping("/insert")
	public ResponseEntity<Ledger> ledgerDetailsInsert(@RequestBody Ledger l )
	{	
		Ledger ledger1 = service.ledgerDetailsInsert(l);
		return new ResponseEntity<Ledger>(ledger1,HttpStatus.OK);
		
	}
	
	@GetMapping("/ledgerView/{ledgerId}")
	public ResponseEntity<Ledger>ledgerView(@PathVariable int ledgerId)
	{
		Ledger view = service.ledgerView(ledgerId);
		
		return new ResponseEntity<Ledger>(view ,HttpStatus.OK);
		
	

}

	
}
