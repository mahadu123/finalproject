package com.sdl.homeloan.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sdl.homeloan.models.Guarantor;
import com.sdl.homeloan.models.GuarantorDTO;
import com.sdl.homeloan.repository.GuarantorRepository;
import com.sdl.homeloan.services.GurantorService;


@Service
public class GurantorServiceIMPL implements GurantorService{
	
	@Autowired
	private GuarantorRepository repo;


	@Override
	public List<Guarantor> getAllGuarantor() {
		
		return repo.findAll();
	}

	@Override
	public String updateGuarantor(Guarantor guarantor) {
		
		repo.save(guarantor);
		
		return "UPDATED";
	}

	@Override
	public Guarantor getGuarantorbyId(int guarantorId) {
		
		Guarantor gut = repo.findById(guarantorId).get();
		
		return gut;
		
	}


	@Override
	public void setDocument(int guarantorId, MultipartFile f1) {
		
		Optional <Guarantor> optional = repo.findById(guarantorId);
		if (optional.isPresent()) {
			Guarantor gut=optional.get();
			try {
				gut.setGurantorDocument(f1.getBytes());
				repo.save(gut);
			} catch (Exception e) {
				System.out.println("Guarantor not found");
			}
			
		}
	
	}

	@Override
	public String insertGuarantor(GuarantorDTO dto) {
		System.out.println(dto);
		Guarantor gut=new Guarantor();
		gut.setGuarantorName(dto.getGuarantorName());
		gut.setGuarantorDateofBirth(dto.getGuarantorDateofBirth());
		gut.setGuarantorjob(dto.getGuarantorjob());
		gut.setGuarantorAdhaarCardNo(dto.getGuarantorAdhaarCardNo());
		gut.setGuarantorRelationshipwithCustomer(dto.getGuarantorRelationshipwithCustomer());
		gut.setGuarantorMobNo(dto.getGuarantorMobNo());
		gut.setGuarantorjob(dto.getGuarantorjob());
		gut.setGuarantoraddress(dto.getGuarantoraddress());
		repo.save(gut);
		return "record created";
	}


	


}
