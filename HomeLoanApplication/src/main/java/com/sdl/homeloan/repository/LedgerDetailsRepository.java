package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.Ledger;

@Repository
public interface LedgerDetailsRepository extends JpaRepository<Ledger, Integer> {

}
