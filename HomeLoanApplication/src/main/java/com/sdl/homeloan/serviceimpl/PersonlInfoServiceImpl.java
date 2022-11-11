package com.sdl.homeloan.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.PersonalInfo;
import com.sdl.homeloan.repository.PersonalInfoRepo;
import com.sdl.homeloan.services.PersonalInfoService;

@Service
public class PersonlInfoServiceImpl implements PersonalInfoService {
	@Autowired
	private PersonalInfoRepo repo;

	@Override
	public PersonalInfo personalInfoInsert(PersonalInfo i) {

		return repo.save(i);
	}

	@Override
	public PersonalInfo personalInfoView(int eId) {

		Optional<PersonalInfo> id = repo.findById(eId);
		PersonalInfo info = id.get();

		return info;

	}

	@Override
	public PersonalInfo updatePersonlInfo(int eId, PersonalInfo i) {
		PersonalInfo info = repo.findById(eId).get();
		info.setName(i.getName());
		info.setMobileNo(i.getMobileNo());
		info.setTypeofLoan(i.getTypeofLoan());
		info.setAdharCardNo(i.getAdharCardNo());
		info.setAge(i.getAge());
		info.setDob(i.getDob());
		info.setPancardNo(i.getPancardNo());
		info.setGender(i.getGender());

		PersonalInfo update = repo.save(i);

		return update;
	}

}
	

	
	
