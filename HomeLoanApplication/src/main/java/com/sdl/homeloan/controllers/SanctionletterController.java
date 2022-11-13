package com.sdl.homeloan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.SanctionLetter;
import com.sdl.homeloan.services.SanctionLetterService;

@RestController
@RequestMapping("/check")
public class SanctionletterController {
    
	@Autowired SanctionLetterService service;
	
	
	   @PostMapping("/createSL")
	  public String CreateSanctionLetter (@RequestBody SanctionLetter sl)
	  {
		  System.out.println("....."+sl+"........");
		   service.createSanctionLetter(sl);
		  return "created";
	  }
	   @GetMapping("/getsanctionletter/{slid}")
	   public SanctionLetter getSanctionletter(@PathVariable int slid)
	   {
		        SanctionLetter sl=service.getSanctionletter(slid);
		        return sl;
	   }
}
