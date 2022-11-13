package com.sdl.homeloan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.EmiDetails;
import com.sdl.homeloan.services.EmiDetailsService;

@RestController
@RequestMapping("/EmiDetailsAPI")
public class EmiDetailsController {

	@Autowired
	private EmiDetailsService service;

	@PostMapping("/saveEMIDetails")
	public ResponseEntity<String> saveEMIDetails(@RequestBody EmiDetails details) {

		String save = service.saveEMiDetails(details);

		return new ResponseEntity<String>(save, HttpStatus.OK);
	}

	@GetMapping("/getEmiDetails/{eid}")
	public ResponseEntity<EmiDetails> getEmiDetails(@PathVariable int eid) {
		EmiDetails id = service.getEMIDetails(eid);
		return new ResponseEntity<EmiDetails>(id, HttpStatus.OK);
	}
	
	@GetMapping("/getAllEMIDetails")
	public ResponseEntity<List<EmiDetails>> getAllEMIDetails(){
		
		List<EmiDetails> list=service.getAllEMIDetails();
		
		return new ResponseEntity<List<EmiDetails>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/updateEMIDetails")
	public ResponseEntity<EmiDetails> updateEMIDetails(@RequestBody EmiDetails details,@PathVariable int eid){
		
		EmiDetails dtl=service.updateEMIDetails(details,eid);
		return new ResponseEntity<EmiDetails>(dtl, HttpStatus.OK);
	}
}
