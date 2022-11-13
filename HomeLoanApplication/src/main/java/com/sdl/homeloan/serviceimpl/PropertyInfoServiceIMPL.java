package com.sdl.homeloan.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.dto.PropertyInfoDTO;
import com.sdl.homeloan.models.PropertyInfo;
import com.sdl.homeloan.repository.PropertyInfoRepository;
import com.sdl.homeloan.services.PropertyInfoService;

@Service
public class PropertyInfoServiceIMPL implements PropertyInfoService {

	@Autowired
	private PropertyInfoRepository repo;

	@Override
	public void insertpDetails(PropertyInfoDTO dto) {

		PropertyInfo p = new PropertyInfo();
		p.setConstructionArea(dto.getConstructionArea());
		p.setPropertyType(dto.getPropertyType());
		p.setPropertyArea(dto.getPropertyArea());
		p.setPropertyPrice(dto.getPropertyPrice());
		p.setConstructionPrice(dto.getConstructionPrice());
		p.setPadr(dto.getPadr());

		repo.save(p);
	}

	@Override
	public void setdocument(int propertyid, MultipartFile file) {

		Optional<PropertyInfo> optional = repo.findById(propertyid);
		if (optional.isPresent()) {
			PropertyInfo pr = optional.get();

			try {
				pr.setPropertyDocument(file.getBytes());
				repo.save(pr);
			} catch (Exception e) {
				System.out.println("PropertyID not Found");
			}

		}
	}

}
