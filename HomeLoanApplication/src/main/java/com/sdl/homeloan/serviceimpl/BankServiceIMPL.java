package com.sdl.homeloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.BankDetails;
import com.sdl.homeloan.repository.BankDetailsRepository;
import com.sdl.homeloan.services.BankService;

@Service
public class BankServiceIMPL implements BankService{
	
	
	@Autowired
	private BankDetailsRepository repo;

	@Override
	public String addbankDetails(BankDetails details) {
		BankDetails save = repo.save(details);
		
		return "Bank Details Added Successfully";
		
	}
	
	public BankDetails updateBankDetails(BankDetails details, int bid) {
		BankDetails bankDetails = repo.findById(bid).get();
		bankDetails.setBranchname(details.getBranchname());
		bankDetails.setBranchcode(details.getBranchcode());
		bankDetails.setBranchaddress(details.getBranchaddress());
		bankDetails.setBranchtype(details.getBranchtype());
		bankDetails.setIfscCode(details.getIfscCode());
		bankDetails.setMicrCode(details.getMicrCode());
		bankDetails.setConatctNO(details.getConatctNO());
		bankDetails.setEmail(details.getEmail());
		bankDetails.setStatus(details.getStatus());
		BankDetails save = repo.save(details);
		
		return save;
	}

	@Override
	public BankDetails getBankDetails(int bid) {
		BankDetails findById = repo.findById(bid).get();
		 
		return findById;
	}

	@Override
	public List<BankDetails> getAllBankDetails() {
		List<BankDetails> findAll = repo.findAll();
		
		return findAll;
	}

	@Override
	public String deleteBankDetails(int bid) {
		repo.deleteById(bid);
		return "Bank Details Deleted Successfully";
	}

}
