package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdl.homeloan.models.Guarantor;
import com.sdl.homeloan.models.GuarantorDTO;

public interface GuarantorRepository extends JpaRepository <Guarantor,Integer> {

	void save(GuarantorDTO gut);

}
