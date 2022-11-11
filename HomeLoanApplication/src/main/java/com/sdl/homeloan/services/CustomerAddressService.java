package com.sdl.homeloan.services;

import com.sdl.homeloan.models.CustomerAddress;

public interface CustomerAddressService {

	void insertadr(CustomerAddress ca);

	CustomerAddress getadr(int adrid);

	CustomerAddress updateaddress(CustomerAddress ad, int adrid);

	
	
	

}
