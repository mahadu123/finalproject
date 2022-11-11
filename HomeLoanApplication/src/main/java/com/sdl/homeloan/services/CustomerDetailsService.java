package com.sdl.homeloan.services;

import java.util.List;

import com.sdl.homeloan.models.CustomerDetails;

public interface CustomerDetailsService {
	
	CustomerDetails addCustomer(CustomerDetails details);
	List<CustomerDetails> getAllCustomer();
	CustomerDetails getByCid(int cid);
	CustomerDetails editDetails(CustomerDetails details);
	String deleteById(int cid);
	CustomerDetails editDetailsById(CustomerDetails details,int cid);
}
