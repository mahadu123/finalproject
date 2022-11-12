package com.sdl.homeloan.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.dto.ProfessionalDetails;
import com.sdl.homeloan.models.Profession;
import com.sdl.homeloan.repository.ProfessionRepository;
import com.sdl.homeloan.repository.ProfessionalDTORepository;
import com.sdl.homeloan.services.ProfessionService;

@Service
public class ProfessionServiceIMPL implements ProfessionService {
    @Autowired
    private ProfessionRepository professionrepo;
    
    @Autowired
    private ProfessionalDTORepository repo;
    
    private static final Logger LOGGER = LogManager.getLogger(ProfessionServiceIMPL.class);
    
	@Override
	public String saveProfessionInfo(Profession profession) {
		Profession profession1 = professionrepo.save(profession);
		if(profession1 != null)
		{
			LOGGER.info("ProfessionInfo  found in DataBase  "+profession.getPid());
		}
		else
		{
			professionrepo.save(profession);
		}	
		
		return "add successfully";
	}

	@Override
	public List getAll() {
		List<Profession> findAll = professionrepo.findAll();
		
		return findAll;
	}

	@Override
	public String deleteById(int pid) {
		professionrepo.deleteById(pid);
		return "Deleted Successfully....";
	}

	@Override
	public Profession updateById(Profession profession, int pid) {
		Optional<Profession> id = professionrepo.findById(pid);
		if(id.isPresent()) {
			Profession profession2 = id.get();
			profession2.setPDesignation(profession.getPDesignation());
			Profession profession3 = professionrepo.save(profession2);
			LOGGER.info(profession3);
			return profession3;
		}
		else {
			LOGGER.info("Id not found....");
		return new Profession();
		}
	}

	@Override
	public String saveSalarySlip(ProfessionalDetails details) {
		repo.save(details);
		return "Save Documents";
	}
}
