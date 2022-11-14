package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LoanDisbursement {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
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
