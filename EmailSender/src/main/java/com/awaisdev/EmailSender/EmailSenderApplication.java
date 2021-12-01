package com.awaisdev.EmailSender;

import com.awaisdev.EmailSender.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail(){
		service.sendSimpleEmail("csraoawais@gmail.com", "Testing", "Hoi k nhi send","awaisjaved089@gmail.com");
	}
}
