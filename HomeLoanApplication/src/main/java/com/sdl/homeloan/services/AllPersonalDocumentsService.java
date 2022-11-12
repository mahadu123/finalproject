package com.sdl.homeloan.services;

import java.util.List;

import com.sdl.homeloan.models.AllPersonalDocuments;

public interface AllPersonalDocumentsService {

	AllPersonalDocuments saveDocument(AllPersonalDocuments docs);

	List<AllPersonalDocuments> getAllDocs();

	AllPersonalDocuments updateById(int documentID);

	String deleteById(int documentID);

	AllPersonalDocuments getById(int documentID);
}
