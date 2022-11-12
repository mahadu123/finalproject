package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.PreviousLoan;
@Repository
public interface PreviousLoanRepository extends JpaRepository<PreviousLoan, Integer>{

}
