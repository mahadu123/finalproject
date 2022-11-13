package com.sdl.homeloan.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AllPersonalDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentID;
	
	@Lob
	private byte[] addressProof;

	@Lob
	private byte[] pancard;

	@Lob
	private byte[] itr;

	@Lob
	private byte[] adharCard;

	@Lob
	private byte[] photo;

	@Lob
	private byte[] signature;

	@Lob
	private byte[] thumb;

	@Lob
	private byte[] bankCheque;

	@Lob
	private byte[] slarySlips;

}
