package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PropertyAddress {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paid;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private double pincode;
	private String streetName;

}
