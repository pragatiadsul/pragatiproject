package com.Expense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.service.email.Email;

@RestController
public class EmailController

{
	@Autowired
	
	private Email email;
	
	@RequestMapping(value = "/sendemail")
	   public String sendEmail() {
		email.sendEmail();
	      return "Email sent successfully";
	   }   

}
