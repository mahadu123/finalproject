package com.sdl.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdl.homeloan.models.PropertyInfo;
@Repository
public interface PropertyInfoRepository extends JpaRepository<PropertyInfo, Integer> {
	
	public void  saveAllDoc(PropertyInfo pi, PropertyInfo pr);
	

}
