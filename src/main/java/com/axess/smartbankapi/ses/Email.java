package com.axess.smartbankapi.ses;

import lombok.Data;

@Data
public class Email {

  String from;

  String to;

  String subject;

  String body;

public Email(String from, String to, String subject, String body) {
	super();
	this.from = from;
	this.to = to;
	this.subject = subject;
	this.body = body;
}

public Email() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}