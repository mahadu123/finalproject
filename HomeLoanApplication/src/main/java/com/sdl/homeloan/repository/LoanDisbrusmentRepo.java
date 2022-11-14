package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdl.homeloan.models.LoanDisbursement;

public interface LoanDisbrusmentRepo extends JpaRepository<LoanDisbursement, Integer> {

}
