package com.sdl.homeloan.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adrid;
	
	
	
	@OneToOne (cascade = CascadeType.ALL)
	private PermanentAddress permanent;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private LocalAddress local;

}
