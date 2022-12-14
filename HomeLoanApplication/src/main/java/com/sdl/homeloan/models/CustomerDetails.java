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
 *@category CustomerDetails
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
	private Guarantor gDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails lDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger legder;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan ploan;
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sletter;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInfo prinfo;
	


}

