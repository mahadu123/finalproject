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

import com.sdl.homeloan.models.PersonalInfo;
import com.sdl.homeloan.services.PersonalInfoService;

@RestController
@RequestMapping("/pi")
public class PersonalInfoController {
	@Autowired
	private PersonalInfoService service;
	
	
	@PostMapping("/personalInfoInsert")
	public ResponseEntity<String>personalInfoInsert(@RequestBody PersonalInfo i)
	{
		service.personalInfoInsert(i);
			
		return new ResponseEntity<String>("Data inserted Succefully" ,HttpStatus.CREATED);
	}
	
	@GetMapping("/personalInfoView/{eId}")
public ResponseEntity<PersonalInfo>personalInfoView(@PathVariable int eId)
{
	
PersonalInfo view = service.personalInfoView(eId);
return new ResponseEntity<PersonalInfo>(view,HttpStatus.OK);
	
}
	@PutMapping("/updatePersonlInfo/{eId}")
	public ResponseEntity<PersonalInfo>updatePersonlInfo(@PathVariable int eId, @RequestBody PersonalInfo i)
	{
		 PersonalInfo update = service.updatePersonlInfo(eId, i);
		
		return new ResponseEntity<PersonalInfo>(update , HttpStatus.ACCEPTED);
	}
}
