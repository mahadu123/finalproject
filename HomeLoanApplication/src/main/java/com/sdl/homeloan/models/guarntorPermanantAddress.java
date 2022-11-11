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
public class guarntorPermanantAddress {
	@Id
	private int houseno;
	private String cityname;
	private String areaname;
	private String state;

}
