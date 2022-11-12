package com.sdl.homeloan.services;


import java.util.List;

import com.sdl.homeloan.models.PreviousLoan;

public interface PreviousLoanService {
	String savepreviousLoan(PreviousLoan previousLoan);

	List getAll();

}
