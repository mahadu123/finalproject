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

import com.sdl.homeloan.models.LoanDetails;
import com.sdl.homeloan.services.LoandetailsService;

@RestController
@RequestMapping("/Loandetails")
public class LoanDetailsController {
	
	
	@Autowired
	private LoandetailsService service;
	
	@PostMapping("/insert")
	public ResponseEntity<String>loanDeatilsInsert(@RequestBody LoanDetails l)
	{	
		service.loanDeatilsInsert(l);
		return new ResponseEntity<String>("Data inserted succefully",HttpStatus.OK);
		
	}
	@GetMapping("/loanView/{loanId}")
	public ResponseEntity<LoanDetails>loanView(@PathVariable int loanId)
	{
		LoanDetails view = service.loanView(loanId);
		
		return new ResponseEntity<LoanDetails>(view ,HttpStatus.ACCEPTED);
		
	}

}
