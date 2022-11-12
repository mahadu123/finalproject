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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.models.AllPersonalDocuments;
import com.sdl.homeloan.services.AllPersonalDocumentsService;

@RestController
@RequestMapping("/docsApi")
public class AllPersonalDocumentsController {

	private static final Logger LOGGER = LogManager.getLogger(AllPersonalDocumentsController.class);

	@Autowired
	private AllPersonalDocumentsService service;

	@PostMapping("/saveDocuments")
	public ResponseEntity<String> saveDocument(@RequestPart MultipartFile f1, @RequestPart MultipartFile f2,
			@RequestPart MultipartFile f3, @RequestPart MultipartFile f4, @RequestPart MultipartFile f5,
			@RequestPart MultipartFile f6, @RequestPart MultipartFile f7, @RequestPart MultipartFile f8,
			@RequestPart MultipartFile f9) throws IOException {
		LOGGER.info("Documents Saved");
		AllPersonalDocuments docs = new AllPersonalDocuments();
		docs.setAddressProof(f1.getBytes());
		docs.setPancard(f2.getBytes());
		docs.setItr(f3.getBytes());
		docs.setAdharCard(f4.getBytes());
		docs.setPhoto(f5.getBytes());
		docs.setSignature(f6.getBytes());
		docs.setThumb(f7.getBytes());
		docs.setBankCheque(f8.getBytes());
		docs.setSlarySlips(f9.getBytes());
		service.saveDocument(docs);
		return new ResponseEntity<String>("Saved Docs", HttpStatus.CREATED);

	}

	@GetMapping("/getAllDocs")
	public ResponseEntity<List<AllPersonalDocuments>> getAllDocs() {
		List<AllPersonalDocuments> allDocs = service.getAllDocs();
		LOGGER.info(allDocs);
		return new ResponseEntity<List<AllPersonalDocuments>>(allDocs, HttpStatus.OK);
	}

	@PutMapping("/updateById/{documentID}")
	public ResponseEntity<String> updateById(@PathVariable int documentID) {
		AllPersonalDocuments newDoc = service.updateById(documentID);
		return new ResponseEntity<String>("updated", HttpStatus.OK);
	}

	@DeleteMapping("/deleteById/{documentID}")
	public ResponseEntity<String> deleteById(@PathVariable int documentID) {
		service.deleteById(documentID);
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
	}

	@GetMapping("/getById/{documentID}")
	public AllPersonalDocuments getById(@PathVariable int documentID) {
		AllPersonalDocuments doc = service.getById(documentID);
		return doc;
	}

}
