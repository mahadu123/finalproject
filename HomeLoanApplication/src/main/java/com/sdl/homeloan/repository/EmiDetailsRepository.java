package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.EmiDetails;

@Repository
public interface EmiDetailsRepository extends JpaRepository<EmiDetails, Integer> {

}
