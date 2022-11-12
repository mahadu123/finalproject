package com.sdl.homeloan.dto;

import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessionalDetails {
	@Lob
	private byte[] psalaryslips;

}
