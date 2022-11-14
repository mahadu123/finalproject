package com.sdl.homeloan.controllers;

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
import java.util.List;

import com.sdl.homeloan.models.Guarantor;

import com.sdl.homeloan.services.GuarntorService;

@RestController
@RequestMapping("/g")
public class GuarntorController {
	
	@Autowired
	private GuarntorService service;

	@PostMapping("/insertGuarantor")
	public ResponseEntity<String> insertGuarantor(@RequestBody Guarantor guarantor) {
		System.out.println(guarantor);
		//http://localhost:8081/g/insertGuarantor
		
		service.insertGuarantor(guarantor);
		
			return new ResponseEntity<String>("record crated",HttpStatus.CREATED);
		
		
	}

	
	@GetMapping("/getAllGuarantor")
	public ResponseEntity<List<Guarantor>>getAllGuarantor(){
		
	     //http://localhost:8081/g/getAllGuarantor
		
	     List<Guarantor> list = service.getAllGuarantor();
	     
		return new ResponseEntity<List<Guarantor>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/getGuarantorbyId/{guarantorId}")
	public ResponseEntity<Guarantor>getGuarantorbyId(@PathVariable int guarantorId){
		
		 //http://localhost:8081/g/getGuarantorbyId/1011
		
		Guarantor guarantor = service.getGuarantorbyId(guarantorId);
		
		return new ResponseEntity<Guarantor>(guarantor,HttpStatus.OK);
	}

	
	@PutMapping("/updateGuarantor")
	public ResponseEntity<String>updateGuarantor(@RequestBody Guarantor guarantor){
		
		// //http://localhost:8081/g/updateGuarantor
		
		String msg=service.updateGuarantor(guarantor);
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
