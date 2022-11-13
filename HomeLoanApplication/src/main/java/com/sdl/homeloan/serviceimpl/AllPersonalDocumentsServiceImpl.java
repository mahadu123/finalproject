package com.sdl.homeloan.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.exceptions.CustomerNotFoundException;
import com.sdl.homeloan.models.AllPersonalDocuments;
import com.sdl.homeloan.repository.AllPersonalDocumentsRepository;
import com.sdl.homeloan.services.AllPersonalDocumentsService;

/**
 * 
 * @author jyotsna_rathod
 *
 */
@Service
public class AllPersonalDocumentsServiceImpl implements AllPersonalDocumentsService {

	private static final Logger LOGGER = LogManager.getLogger(AllPersonalDocumentsServiceImpl.class);

	@Autowired
	private AllPersonalDocumentsRepository docRepository;

	@Override
	public AllPersonalDocuments saveDocument(AllPersonalDocuments docs) {
		AllPersonalDocuments personalDocs = docRepository.save(docs);
		return personalDocs;
	}

	//used java8 feature reference method
	@Override
	public List<AllPersonalDocuments> getAllDocs() {
		List<AllPersonalDocuments> allDocuments = docRepository.findAll();
		allDocuments.forEach(System.out::println);
		return allDocuments;
	}

	@Override
	public AllPersonalDocuments updateById(int documentID) {
		Optional<AllPersonalDocuments> existingDocument = docRepository.findById(documentID);
		if (existingDocument.isPresent()) {
			AllPersonalDocuments personalDocuments = existingDocument.get();
			personalDocuments.setBankCheque(personalDocuments.getBankCheque());
			personalDocuments.setPhoto(personalDocuments.getPhoto());
			personalDocuments.setSalarySlip(personalDocuments.getSalarySlip());
			AllPersonalDocuments updatedDocuments = docRepository.save(personalDocuments);
			return updatedDocuments;
		}
		return null;
	}

	@Override
	public String deleteById(int documentID) {
		if (docRepository.existsById(documentID)) {
			docRepository.deleteById(documentID);
			return "Deleted Successfully!!";
		}
		else {
			throw new CustomerNotFoundException();
		}
	}

	//Java 8 feature functional interface 'Optional' is used
	@Override
	public AllPersonalDocuments getById(int documentID) {
		Optional<AllPersonalDocuments> opPersonalDoc = docRepository.findById(documentID);
		if (opPersonalDoc.isPresent()) {
			AllPersonalDocuments personalDoc = opPersonalDoc.get();
			return personalDoc;
		} else {
			throw new CustomerNotFoundException();
		}

	}


}
