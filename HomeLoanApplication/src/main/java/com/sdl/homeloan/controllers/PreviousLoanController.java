package com.sdl.homeloan.controllers;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.PreviousLoan;
import com.sdl.homeloan.services.PreviousLoanService;

@RestController
@RequestMapping("/previousLoan")
public class PreviousLoanController {
	@Autowired
	private PreviousLoanService previousLoanservice;
	
	private static final Logger LOGGER = LogManager.getLogger(PreviousLoanController.class);
	
	@PostMapping("/savepreviousLoan")
	public ResponseEntity<String> savepreviousLoan(@RequestBody PreviousLoan previousLoan){
		previousLoanservice.savepreviousLoan(previousLoan);
		LOGGER.info("Documents Saved");
		return new ResponseEntity<String>("Profession Information Save Successfully.....",HttpStatus.CREATED);
		
	}
	
	public ResponseEntity<List> getAll(){
		List all = previousLoanservice.getAll();
		LOGGER.info(all);
		return new ResponseEntity<List>(all,HttpStatus.OK);
		
		
		}
	  
	  

}
