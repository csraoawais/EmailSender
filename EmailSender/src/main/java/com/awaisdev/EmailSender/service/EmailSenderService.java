package com.awaisdev.EmailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendSimpleEmail(String toEmail, String subject, String body, String cc)
    {
        SimpleMailMessage message= new SimpleMailMessage();
        message.setFrom("mrraaj089@gmail.com");
        message.setTo(toEmail);
        message.setCc(cc);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        if (cc!=null && toEmail!=null)
        {
            try {
                System.out.println("Mail Sent To : " + toEmail + cc);
            }
            catch (Exception e)
            {
                System.out.println("Email not found" + e );
            }
        }

    }
}
