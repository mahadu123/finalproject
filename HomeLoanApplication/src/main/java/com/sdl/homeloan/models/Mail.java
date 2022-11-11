package com.sdl.homeloan.models;

import org.springframework.beans.factory.annotation.Value;

public class Mail {

	@Value("${mail.from}")
	private String from;
	private String to;
	private String subject;
	private String msg;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
