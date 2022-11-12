package com.sdl.homeloan.serviceimpl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.PreviousLoan;
import com.sdl.homeloan.repository.PreviousLoanRepository;
import com.sdl.homeloan.services.PreviousLoanService;
@Service
public class PreviousLoanServiceIMPL implements PreviousLoanService{
	
     @Autowired
     private PreviousLoanRepository previousLoanrepo;

     private static final Logger LOGGER = LogManager.getLogger(PreviousLoan.class);

	@Override
	public String savepreviousLoan(PreviousLoan previousLoan) {
		PreviousLoan previousLoan2 = previousLoanrepo.save(previousLoan);
		if(previousLoan2 != null)
		{
			LOGGER.info("PreviousLoan   found in DataBase  "+ previousLoan.getPloanId());	
		}	
		else
		{
			previousLoanrepo.save(previousLoan);
		}	
		return "add successfully";
	}

	@Override
	public List getAll() {
		List<PreviousLoan> findAll = previousLoanrepo.findAll();
		return findAll;
	}

	

	
     
	

}

