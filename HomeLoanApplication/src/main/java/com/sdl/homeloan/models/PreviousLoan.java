
package com.sdl.homeloan.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ploanId;
	private double ploanAmount;
	private int pTenure;
	private double paidAmount;
	private double remainingAmount;
	private int deafaulterCount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanBank pbankDetails;
	
	private String status;
	private String remark;


}
