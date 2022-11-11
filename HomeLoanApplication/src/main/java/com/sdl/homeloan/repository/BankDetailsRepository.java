package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sdl.homeloan.models.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer> {

}
