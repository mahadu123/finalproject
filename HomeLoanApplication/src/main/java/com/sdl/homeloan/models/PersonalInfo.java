package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString

public class PersonalInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String name;
	private String dob;
	private int age ;
	private String gender;
	
	private String email;
	private long mobileNo;
	private String pancardNo;
	private long AdharCardNo;
	//@OneToMany
	//private CustomerAddress address;
	private String TypeofLoan;
}

