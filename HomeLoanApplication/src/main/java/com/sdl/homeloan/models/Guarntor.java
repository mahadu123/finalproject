package com.sdl.homeloan.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Guarntor {
	
	@Id
	private int guarantorId;
	private String guarantorName;
	private String guarantorDateofBirth;
	private String guarantorRelationshipwithCustomer;
	private double guarantorMobNo;
	private double guarantorAdhaarCardNo;
	
	@OneToOne(cascade=CascadeType.ALL)
	private guarantorJobDetail guarantorjob;
	
    @OneToOne(cascade=CascadeType.ALL)
	private guarntorPermanantAddress guarantoraddress;
	
	

}
