package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankDetails {
	
	private String branchname;
	private double branchcode;
	@Id
	private int branchid;
	private String branchtype;
	private String ifscCode;
	private String  micrCode;
	private double conatctNO;
	private String branchaddress;
	private String email;
	private String status;
	

}
