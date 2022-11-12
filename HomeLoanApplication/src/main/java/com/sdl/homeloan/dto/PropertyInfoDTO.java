package com.sdl.homeloan.dto;

import com.sdl.homeloan.models.PropertyAddress;

import lombok.Data;

@Data
public class PropertyInfoDTO {

	private String propertyType;
	private String propertyArea;
	private String constructionArea;
	private double propertyPrice;
	private double constructionPrice;
	private PropertyAddress padr;
}
