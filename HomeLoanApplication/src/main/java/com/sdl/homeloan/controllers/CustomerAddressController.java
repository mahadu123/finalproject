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

import com.sdl.homeloan.models.CustomerAddress;
import com.sdl.homeloan.services.CustomerAddressService;

@RestController
@RequestMapping("/cadrs")
public class CustomerAddressController {
	
	@Autowired
	private CustomerAddressService service;
	
	@PostMapping("/insertaddress")
	public ResponseEntity<String> insertadr(@RequestBody CustomerAddress ca){
		
		service.insertadr(ca);
		
		return new ResponseEntity<String>("Address inserted",HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getaddress/{adrid}")
	public ResponseEntity<CustomerAddress> getaddress(@PathVariable int adrid){
		
		CustomerAddress ad=service.getadr(adrid);
		
		return new ResponseEntity<CustomerAddress>(ad,HttpStatus.FOUND);
		
	}
	
	@PutMapping("/updateaddress/{adrid}")
	public ResponseEntity<CustomerAddress> updateaddress(@RequestBody CustomerAddress ad,@PathVariable int adrid){
		
		CustomerAddress	update=service.updateaddress(ad,adrid);
		return new ResponseEntity<CustomerAddress>(update,HttpStatus.OK);
		
	}

}






