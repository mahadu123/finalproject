package com.sdl.homeloan.models;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.aspectj.lang.annotation.DeclareAnnotation;

import lombok.Data;

@Data
public class GuarantorDTO {
	
	private int guarantorId;
	private String  guarantorName;
	private String  guarantorDateofBirth;
	private String guarantorRelationshipwithCustomer;
	private long guarantorMobNo;
	private long guarantorAdhaarCardNo;
	
	@OneToOne(cascade=CascadeType.ALL)
	private GuarantorJobDetail guarantorjob;
	
    @OneToOne(cascade=CascadeType.ALL)
	private GuarantorPermanantAddress guarantoraddress;

	

}
