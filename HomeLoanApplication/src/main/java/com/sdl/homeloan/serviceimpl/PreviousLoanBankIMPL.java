package com.sdl.homeloan.serviceimpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.PreviousLoanBank;
import com.sdl.homeloan.repository.PreviousLoanBankRepository;
import com.sdl.homeloan.services.PreviousLoanBankService;

@Service
public class PreviousLoanBankIMPL implements PreviousLoanBankService {
	@Autowired
   private PreviousLoanBankRepository previousLoanBankrepo;
	
	private static final Logger LOGGER = LogManager.getLogger(PreviousLoanBankIMPL.class);
	
	

	@Override
	public String savepreviousLoanBank(PreviousLoanBank previousLoanBank) {
		PreviousLoanBank previousLoanBank2 = previousLoanBankrepo.save(previousLoanBank);
		if(previousLoanBank2 !=null)
		{
			LOGGER.info("PreviousLoanBank ID  found in DataBase  "+ previousLoanBank.getBranchId());
		}	
		else
		{
			previousLoanBankrepo.save(previousLoanBank);
		}
		return  "add successfully";
	}
	

}
