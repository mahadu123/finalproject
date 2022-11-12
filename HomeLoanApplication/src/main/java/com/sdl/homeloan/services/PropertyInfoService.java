package com.sdl.homeloan.services;

import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.dto.PropertyInfoDTO;

public interface PropertyInfoService {



	void insertpDetails(PropertyInfoDTO dto);

	void setdocument(int propertyid, MultipartFile file);

}
