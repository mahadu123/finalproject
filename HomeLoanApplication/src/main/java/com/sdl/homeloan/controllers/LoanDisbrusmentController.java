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

import com.sdl.homeloan.models.LoanDisbursement;
import com.sdl.homeloan.services.LoanDisbrumentService;


@RestController
@RequestMapping("/hlo")
public class LoanDisbrusmentController {
	
	
	@Autowired
	private LoanDisbrumentService service;
	
	
	@PostMapping("/inserdata")
	public ResponseEntity<String>inserdata(@RequestBody LoanDisbursement l)
	{
		
		service.inserdata(l);
		return new ResponseEntity<String>("data inserted succefully" , HttpStatus.ACCEPTED);
		
	}
	 @GetMapping("/view/{agreementid}")
	 public ResponseEntity<LoanDisbursement>view(@PathVariable int agreementid)
	 {
		 service.view(agreementid);
		return null;
	 }

}
