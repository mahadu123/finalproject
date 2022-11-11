package com.sdl.homeloan.services;

import java.util.List;

import com.sdl.homeloan.models.BankDetails;

public interface BankService {

	String addbankDetails(BankDetails details);

	BankDetails updateBankDetails(BankDetails details, int bid);

	BankDetails getBankDetails(int bid);

	List<BankDetails> getAllBankDetails();

	String deleteBankDetails(int bid);

}
