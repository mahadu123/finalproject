package com.sdl.homeloan.models;

import javax.annotation.Generated;
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
public class PreviousLoanBank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String branchName;
	private double branchCode;
	private String branchType;
	private String ifscCode;
	private String micrCode;
	private double conatctNO;
	private String branchAddress;
	private String email;
	private String status;


}
