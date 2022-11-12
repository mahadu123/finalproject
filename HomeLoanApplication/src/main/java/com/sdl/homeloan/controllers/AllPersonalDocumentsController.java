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

	@PostMapping("/AllDocuments")
	public ResponseEntity<String> saveDocument(@RequestPart MultipartFile addressProofFile, @RequestPart MultipartFile panCardFile,
			@RequestPart MultipartFile ITRFile, @RequestPart MultipartFile adharCardFile, @RequestPart MultipartFile photoFile,
			@RequestPart MultipartFile signatureFile, @RequestPart MultipartFile thumbFile, @RequestPart MultipartFile bankCheckFile,
			@RequestPart MultipartFile salarySlipsFile) throws IOException {
		LOGGER.info("Documents Saved");
		AllPersonalDocuments docs = new AllPersonalDocuments();
		docs.setAddressProof(addressProofFile.getBytes());
		docs.setPancard(panCardFile.getBytes());
		docs.setItr(ITRFile.getBytes());
		docs.setAdharCard(adharCardFile.getBytes());
		docs.setPhoto(photoFile.getBytes());
		docs.setSignature(signatureFile.getBytes());
		docs.setThumbImpression(thumbFile.getBytes());
		docs.setBankCheque(bankCheckFile.getBytes());
		docs.setSalarySlip(salarySlipsFile.getBytes());
		service.saveDocument(docs);
		return new ResponseEntity<String>("All Documents Saved", HttpStatus.CREATED);

	}

	@GetMapping("/v1/documents")
	public ResponseEntity<List<AllPersonalDocuments>> getAllDocs() {
		LOGGER.info("Get all documents");
		List<AllPersonalDocuments> allDocuments = service.getAllDocs();
		LOGGER.info(String.format("Recived all documents : {0}", allDocuments));
		return new ResponseEntity<List<AllPersonalDocuments>>(allDocuments, HttpStatus.OK);
	}

	@PutMapping("/v1/documents/{documentID}")
	public ResponseEntity<String> updateById(@PathVariable int documentID) {
		AllPersonalDocuments newDoc = service.updateById(documentID);
		return new ResponseEntity<String>("updated", HttpStatus.OK);
	}

	@DeleteMapping("/v1/documents/{documentID}")
	public ResponseEntity<String> deleteById(@PathVariable int documentID) {
		service.deleteById(documentID);
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
	}

	@GetMapping("/v1/documents/{documentID}")
	public AllPersonalDocuments getById(@PathVariable int documentID) {
		AllPersonalDocuments doc = service.getById(documentID);
		return doc;

	}

}
