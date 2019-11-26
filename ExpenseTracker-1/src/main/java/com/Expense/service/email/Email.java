package com.Expense.service.email;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class Email 
{
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmail()
	{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo("solankarnilesh@sggs.ac.in");
		simpleMailMessage.setSubject("Spring Boot");
		simpleMailMessage.setText("Spring Boot");
		
		javaMailSender.send(simpleMailMessage);
	}
	
	
	public void sendEmailWithAttachment() throws MessagingException
	{
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setTo("govindkapure9890@gmail.com");
		mimeMessageHelper.setSubject("Spring Boot");
		mimeMessageHelper.setText("Spring Boot");
		FileSystemResource fileSystemResource = new FileSystemResource(new File("pom.xml"));
		mimeMessageHelper.addAttachment("Test", fileSystemResource);
		javaMailSender.send(mimeMessage);
	}
}
