package com.sdl.homeloan.serviceimpl ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.sdl.homeloan.models.Mail;
import com.sdl.homeloan.services.MailService;

@Service
public class MailServiceImpl implements MailService{

	
	@Autowired
	private JavaMailSender sender;
	@Override
	public String frommail(Mail mail) {
	SimpleMailMessage msg = new SimpleMailMessage();
	msg.setFrom(mail.getFrom());
	msg.setTo(mail.getTo());
	msg.setSubject(mail.getSubject());
	msg.setText(mail.getMsg());
	
	
	sender.send(msg);
		return "success";
	}

	
	
	
	
	
	
	
	
}
