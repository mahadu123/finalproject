package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Mahadu Mukir
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
	@Id
	private int cid;
	@OneToOne
	private PersonalInfo Pinfo;
	@OneToOne
	private CustomerAddress cAddr;
	@OneToOne
	private AllPersonalDocuments docs;
	@OneToOne
	private Guarntor gDetails;
	@OneToOne
	private BankDetails bDetails;
	@OneToOne
	private Profession profession;
	@OneToOne
	private LoanDetails lDetails;
	@OneToOne
	private Ledger legder;
	//private ApplicationStaus status;
}

