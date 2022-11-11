package com.sdl.homeloan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.BankDetails;
import com.sdl.homeloan.services.BankService;

@RestController
@RequestMapping("/bankDetails")
public class BankDetailsController {

	@Autowired
	private BankService bankservice;

	@PostMapping("/addBankDetails")
	public ResponseEntity<String> addBankDetails(@RequestBody BankDetails details) {

		String addbankDetails = bankservice.addbankDetails(details);

		return new ResponseEntity<String>(addbankDetails, HttpStatus.OK);

	}

	@PutMapping("/updateBankDetails/{bid}")
	public ResponseEntity<BankDetails> updateBankDetails(@RequestBody BankDetails details, @PathVariable int bid) {

		BankDetails details2 = bankservice.updateBankDetails(details, bid);

		return new ResponseEntity<BankDetails>(details2, HttpStatus.OK);
	}

	@GetMapping("/getBankDetails/{bid}")
	public ResponseEntity<BankDetails> getBankDetails(@PathVariable int bid) {

		BankDetails details = bankservice.getBankDetails(bid);
		return new ResponseEntity<BankDetails>(details, HttpStatus.OK);
	}

	@GetMapping("/GetAllBankDetails")
	public ResponseEntity<List<BankDetails>> getAllBankDetails() {

		List<BankDetails> list = bankservice.getAllBankDetails();

		return new ResponseEntity<List<BankDetails>>(list, HttpStatus.OK);

	}

	@DeleteMapping("/deleteBankDetails/{bid}")
	public ResponseEntity<String> deleteBankDetails(@PathVariable int bid) {
		String dlt = bankservice.deleteBankDetails(bid);

		return new ResponseEntity<String>(dlt, HttpStatus.OK);
	}

}
