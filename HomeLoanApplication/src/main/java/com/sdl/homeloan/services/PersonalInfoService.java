package com.sdl.homeloan.services;



import com.sdl.homeloan.models.PersonalInfo;

public interface PersonalInfoService {

	Object personalInfoInsert(PersonalInfo i);

	PersonalInfo personalInfoView(int eId);

	PersonalInfo updatePersonlInfo(int eId, PersonalInfo i);



	
}
