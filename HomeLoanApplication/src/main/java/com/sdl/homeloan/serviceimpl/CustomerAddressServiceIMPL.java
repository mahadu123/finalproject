package com.sdl.homeloan.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.exceptions.IDNotFoundException;
import com.sdl.homeloan.models.CustomerAddress;
import com.sdl.homeloan.repository.CustomerAddressRepository;
import com.sdl.homeloan.services.CustomerAddressService;

@Service
public class CustomerAddressServiceIMPL implements CustomerAddressService{
	
	@Autowired
	private CustomerAddressRepository repo;

	@Override
	public void insertadr(CustomerAddress ca) {
	
			repo.save(ca);
		
	}

	@Override
	public CustomerAddress getadr(int adrid) {
		if (repo.existsById(adrid)) {
			
		
		
		 Optional<CustomerAddress> adr = repo.findById(adrid);
		 CustomerAddress address = adr.get();
		 return address;
		}
		else {
			throw new IDNotFoundException();
		}
	}

	@Override
	public CustomerAddress updateaddress(CustomerAddress ad, int adrid) {
		
		 CustomerAddress info = repo.findById(adrid).get();
		 
		info.setLocal(ad.getLocal());
		info.setPermanent(ad.getPermanent());
		
		CustomerAddress up = repo.save(ad);
		
		return up;
	}



}
