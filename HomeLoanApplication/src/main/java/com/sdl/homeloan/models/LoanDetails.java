package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private int loanNo;
	private double loanAmount ;
	private String rateOfInterest;
	private int tenure;
	private double totalAmountBePaid;
	private double processingfee;
	private  double totalInterest;
	private String sanctiondate;
	private String remark;
	private String satus;
	

}
