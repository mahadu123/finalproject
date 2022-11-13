package com.sdl.homeloan.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
public class LoanDisbursement {
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agreementid;
	private int loanNO;
	private String agrrementDate;
	private String  amountpayType;
	private double totalamount;
	private String bankName;
	private double accountNumber;
	private String ifsc;
	private String accounType;
	private double transferAmount;
	private String PaymentStatus;
	private String amountPaiddate;

}
