package com.sdl.homeloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sdl.homeloan.exceptions.CustomerNotFoundException;
import com.sdl.homeloan.models.CustomerDetails;
import com.sdl.homeloan.repository.CustomerDetailsRepository;
import com.sdl.homeloan.services.CustomerDetailsService;

public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	@Autowired
	private CustomerDetailsRepository repo;
	
	@Override
	public CustomerDetails addCustomer(CustomerDetails details) {
		
		return repo.save(details);
	}
		

	@Override
	public List<CustomerDetails> getAllCustomer() {
		
		return repo.findAll();
	}

	@Override
	public CustomerDetails getByCid(int cid) {
		boolean anyMatch = repo.findAll().stream().anyMatch(p->p.getCid()==cid);
		if (anyMatch) {
			CustomerDetails cdet = repo.findById(cid).get();
			return cdet;
		}
		else {
			throw new CustomerNotFoundException();
		}
		
	}

	@Override
	public CustomerDetails editDetails(CustomerDetails details) {
		boolean match = repo.findAll().stream().anyMatch(p->p.getCid()==details.getCid());
		if(match) {
				return addCustomer(details);
		}
		else {
			return null;
		}
	}

	@Override
	public String deleteById(int cid) {
		if (repo.existsById(cid)) {
			repo.deleteById(cid);
			return "Deleted Successfully";
			
		}
		else {
			throw new CustomerNotFoundException();
		}
		
		
	}

	@Override
	public CustomerDetails editDetailsById(CustomerDetails details, int cid) {
		CustomerDetails cds = repo.findById(cid).get();
		if (repo.existsById(cid)) {
			cds.setBDetails(details.getBDetails());
			cds.setCAddr(details.getCAddr());
			cds.setDocs(details.getDocs());
			cds.setGDetails(details.getGDetails());
			cds.setLDetails(details.getLDetails());
			cds.setLegder(details.getLegder());
			cds.setPinfo(details.getPinfo());
			cds.setProfession(details.getProfession());
			cds.setStatus(details.getStatus());
			return repo.save(details);
		}
		else {
			return null;
		}
		
	}

}

