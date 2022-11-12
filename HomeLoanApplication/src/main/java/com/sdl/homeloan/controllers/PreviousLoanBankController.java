package com.sdl.homeloan.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.PreviousLoanBank;
import com.sdl.homeloan.services.PreviousLoanBankService;

@RestController
@RequestMapping("/previousLoanBank")
public class PreviousLoanBankController {
	@Autowired
	private PreviousLoanBankService previousLoanBankservice;
	
	private static final Logger LOGGER = LogManager.getLogger(PreviousLoanBankController.class);
	
	@PostMapping("/savepreviousLoanBank")
	public ResponseEntity<String> savepreviousLoanBank(@RequestBody PreviousLoanBank previousLoanBank){
		previousLoanBankservice.savepreviousLoanBank(previousLoanBank);
		LOGGER.info("Profession Info added");
		return new ResponseEntity<String>("Profession Information Save Successfully.....",HttpStatus.CREATED);
		
	}
	
	
}
