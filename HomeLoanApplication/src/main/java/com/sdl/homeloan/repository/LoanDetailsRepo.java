package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.LoanDetails;
@Repository
public interface LoanDetailsRepo extends JpaRepository<LoanDetails, Integer>{

}
