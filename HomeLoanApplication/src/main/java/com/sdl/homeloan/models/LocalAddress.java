package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private int pincode;
	private int houseno;
	private String streetName;
	

}
