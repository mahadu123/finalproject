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

import com.sdl.homeloan.models.PreviousLoan;
import com.sdl.homeloan.models.PreviousLoanBank;
import com.sdl.homeloan.services.PreviousLoanBankService;
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
		return new ResponseEntity<String>("Profession Information Save Successfully.....",HttpStatus.CREATED);
		
	}
	
	/*
	 * @GetMapping("/getAll") public ResponseEntity<List> getAll(){ List all =
	 * service.getAll(); LOGGER.info(all); all.forEach(System.out::println); return
	 * new ResponseEntity<List>(all,HttpStatus.OK); }
	 * 
	 * @DeleteMapping("/deleteById/{pid}") public ResponseEntity<String>
	 * deleteById(@PathVariable int pid ){ service.deleteById(pid); return new
	 * ResponseEntity<String>("Deleted Successfully....",HttpStatus.OK); }
	 * 
	 * @PutMapping("/updateById/{pid}") public ResponseEntity<Profession>
	 * upupdateById(@RequestBody Profession profession,@PathVariable int pid){
	 * Profession updateById = service.updateById(profession, pid); return new
	 * ResponseEntity<Profession>(updateById,HttpStatus.OK); }
	 */
}
s