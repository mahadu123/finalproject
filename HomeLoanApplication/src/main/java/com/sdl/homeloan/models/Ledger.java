package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ledger {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerid;
	private String ledgercreateddate;
	private double totalloanamount;
	private double payableamountwithinterest;
	private int tenure;
	private double monthlyemi;
	private double amountpaidtilldate;
	private double remainingamount;
	private String nextemidatestart;
	private String nextemidateend;
	private String previousemitstatus;
	private String currentmonthemistatus;
	private String loanenddate;
	private String loanstatus;

	

	

}
