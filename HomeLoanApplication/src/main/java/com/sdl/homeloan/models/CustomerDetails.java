package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
	@Id
	private int cid;
	private PersonalInfo Pinfo;
	private CustomerAddress cAddr;
	private AllPersonalDocuments docs;
	private GuarntorDeatils gDetails;
	private BankDetails bDetails;
	private Profession profession;
	private LoanDetails lDetails;
	private Ledger legder;
	private ApplicationStaus status;
}
