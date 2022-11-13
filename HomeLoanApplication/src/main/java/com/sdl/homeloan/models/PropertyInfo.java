package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PropertyInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyid;
	private String propertyType;
	private String propertyArea;
	private String constructionArea;
	private double propertyPrice;
	private double constructionPrice;
	@Lob
	private byte[] propertyDocument;
	@OneToOne
	private PropertyAddress padr;
}
