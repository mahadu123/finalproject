package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.SanctionLetter;

@Repository
public interface SanctionLetterRepository extends JpaRepository<SanctionLetter, Integer> {

}
