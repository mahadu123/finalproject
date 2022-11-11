package com.sdl.homeloan.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.AllPersonalDocuments;
import com.sdl.homeloan.repository.AllPersonalDocumentsRepository;
import com.sdl.homeloan.services.AllPersonalDocumentsService;

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

	@Override
	public List<AllPersonalDocuments> getAllDocs() {
		List<AllPersonalDocuments> AllDocuments = docRepository.findAll();
		AllDocuments.forEach(System.out::println);
		return AllDocuments;
	}

	@Override
	public AllPersonalDocuments updateById(int documentID) {
		Optional<AllPersonalDocuments> existigDoc = docRepository.findById(documentID);
		if (existigDoc.isPresent()) {
			AllPersonalDocuments personalDocs = existigDoc.get();
			personalDocs.setBankCheque(personalDocs.getBankCheque());
			personalDocs.setPhoto(personalDocs.getPhoto());
			personalDocs.setSlarySlips(personalDocs.getSlarySlips());
			AllPersonalDocuments updatedDocs = docRepository.save(personalDocs);
			return updatedDocs;
		}
		return null;
	}

	@Override
	public String deleteById(int documentID) {
		docRepository.deleteById(documentID);
		return "Deleted Successfully!!";
	}

}
