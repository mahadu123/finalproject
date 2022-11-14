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

import com.sdl.homeloan.models.CustomerDetails;
import com.sdl.homeloan.services.CustomerDetailsService;


@RestController
@RequestMapping("/custDetails")
public class CustomerDetailsController {
	@Autowired
	private CustomerDetailsService service;
	@PostMapping("/addCustomer")
	public ResponseEntity<CustomerDetails> addCustomer(@RequestBody CustomerDetails details) {
		
		CustomerDetails cust = service.addCustomer(details);
		
		return new ResponseEntity<CustomerDetails>(cust,HttpStatus.OK);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<CustomerDetails>> getAll() {
		List<CustomerDetails> list = service.getAllCustomer();
		return new ResponseEntity<List<CustomerDetails>>(list,HttpStatus.OK);
	}
	@GetMapping("/getById/{cid}")
	public ResponseEntity<CustomerDetails> getById(@PathVariable int cid) {
		CustomerDetails cuid = service.getByCid(cid);
		return new ResponseEntity<CustomerDetails>(cuid,HttpStatus.OK);
	}
	@PutMapping("/editCutomer")
	public ResponseEntity<String> editCutomer(@RequestBody CustomerDetails details) {
		CustomerDetails edit = service.editDetails(details);
		if(edit!=null) {
		return new ResponseEntity<String>("Data Updated",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Customer Not Found",HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/deleteById/{cid}")
	public ResponseEntity<String> deleteById(@PathVariable int cid) {
		String id = service.deleteById(cid);
		return new ResponseEntity<String>(id,HttpStatus.OK);
	}
	
	@PutMapping("/editCutomer/{cid}")
	public ResponseEntity<String> editCutomer(@RequestBody CustomerDetails details,@PathVariable int cid) {
		CustomerDetails edit = service.editDetailsById(details, cid);
		if(edit!=null) {
		return new ResponseEntity<String>("Data Updated",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Customer Not Found",HttpStatus.NOT_FOUND);
		}
	}
}
