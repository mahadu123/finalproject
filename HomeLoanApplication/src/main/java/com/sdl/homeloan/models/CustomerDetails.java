package com.sdl.homeloan.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalInfo Pinfo;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress cAddr;
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocuments docs;
	@OneToOne(cascade = CascadeType.ALL)
	private Guarntor gDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails lDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger legder;





}

