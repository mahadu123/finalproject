package com.sdl.homeloan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.dto.PropertyInfoDTO;
import com.sdl.homeloan.services.PropertyInfoService;

@RestController
@RequestMapping("/proadr")
public class PropertyInfoController {

	@Autowired
	private PropertyInfoService service;

	@PostMapping("/insertp")
	public ResponseEntity<String> insertProperty(@RequestBody PropertyInfoDTO dto) {

		service.insertpDetails(dto);
		return new ResponseEntity<String>("Property Inserted", HttpStatus.OK);

	}

	@PutMapping("/uplodedoc/{propertyid}")
	public ResponseEntity<String> uplodedoc(@PathVariable int propertyid, @RequestPart MultipartFile file) {

		service.setdocument(propertyid, file);
		return new ResponseEntity<String>("Document Inserted", HttpStatus.OK);
	}

}
