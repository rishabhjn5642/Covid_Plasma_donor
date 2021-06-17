package com.example.rishabh.service.impl;


import com.example.rishabh.model.FeedBackDTO;
import com.example.rishabh.service.Config.MailConfig;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;


import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    private MailConfig emailCfg;



    public void mailSender(FeedBackDTO feedback)
    {
        // Create a mail sender
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(this.emailCfg.getHost());
        mailSender.setPort(this.emailCfg.getPort());
        mailSender.setUsername(this.emailCfg.getUsername());
        mailSender.setPassword(this.emailCfg.getPassword());

        // Create an email instance
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(feedback.getEmail());
        mailMessage.setTo("rc@feedback.com");
        mailMessage.setSubject("New feedback from " + feedback.getName());
        mailMessage.setText(feedback.getFeedback());

        // Send mail
        mailSender.send(mailMessage);
    }
}
