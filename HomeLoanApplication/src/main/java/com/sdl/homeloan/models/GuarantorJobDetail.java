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
public class GuarantorJobDetail {
	@Id
	private int empid;
	private String companyname;
	private String companylocation;
	

}
