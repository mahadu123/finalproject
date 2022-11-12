package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.PreviousLoanBank;
@Repository
public interface PreviousLoanBankRepository extends JpaRepository<PreviousLoanBank, Integer> {

}
