package com.sdl.homeloan.controllers;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.dto.ProfessionalDetails;
import com.sdl.homeloan.models.Profession;
import com.sdl.homeloan.services.ProfessionService;

@RestController
@RequestMapping("/profession")
public class ProfessionController {
	@Autowired
	private ProfessionService service;
	
	private static final Logger LOGGER = LogManager.getLogger(ProfessionController.class);
	
	@PostMapping("/saveProfessionInfo")
	public ResponseEntity<String> saveProfessionInfo(@RequestBody Profession profession){
		service.saveProfessionInfo(profession);
		return new ResponseEntity<String>("Profession Information Save Successfully.....",HttpStatus.CREATED);
		
	}
	
	@PostMapping("/saveSalarySlip")
	public ResponseEntity<String> saveSalarySlip(@RequestPart MultipartFile f1) throws IOException{
		ProfessionalDetails details=new ProfessionalDetails();
		details.setPsalaryslips(f1.getBytes());
		service.saveSalarySlip(details);
		
		return new ResponseEntity<String>("Document added",HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List> getAll(){
		List all = service.getAll();
		LOGGER.info(all);
		all.forEach(System.out::println);
		return new ResponseEntity<List>(all,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{pid}")
	public ResponseEntity<String> deleteById(@PathVariable int pid ){
		service.deleteById(pid);
		return new ResponseEntity<String>("Deleted Successfully....",HttpStatus.OK);
	}
	
	@PutMapping("/updateById/{pid}")
	public ResponseEntity<Profession> upupdateById(@RequestBody Profession profession,@PathVariable int pid){
		Profession updateById = service.updateById(profession, pid);
		return new ResponseEntity<Profession>(updateById,HttpStatus.OK);
	}

}
