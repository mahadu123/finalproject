package com.sdl.homeloan.services;

import com.sdl.homeloan.models.LoanDetails;

public interface LoandetailsService {

	LoanDetails loanDeatilsInsert(LoanDetails l);

	LoanDetails loanView(int loanId);

}
