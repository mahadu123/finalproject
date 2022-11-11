package com.sdl.homeloan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdl.homeloan.models.Mail;
import com.sdl.homeloan.services.MailService;

@RestController
@RequestMapping("/mail")
public class Mail_Controller {
	
	
	@Autowired
    private MailService service;
	
	
	@PostMapping("sendmail")
	public String frommail(@RequestBody Mail mail)
	{
		
		
return	service.frommail(mail);
		
	}
	
	
}
