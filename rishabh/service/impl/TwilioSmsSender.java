package com.example.rishabh.service.impl;
import com.example.rishabh.dao.entity.Otpverify;

import com.example.rishabh.dao.repository.OtpRepo;
import com.example.rishabh.dao.service.impl.OtpServiceDaoImpl;

import com.example.rishabh.model.SmsRequestDTO;
import com.example.rishabh.service.Config.TwilioConfig;
import com.example.rishabh.service.SmsSender;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {

    @Autowired
    private OtpRepo otpRepo;

    int randomPIN = (int)(Math.random()*9000)+1000;
    private String message;

    private final TwilioConfig twilioConfig;

    @Autowired
    private OtpServiceDaoImpl otpServiceDaoimpl;

    @Autowired
    public TwilioSmsSender(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    @Override
    public int savedao(SmsRequestDTO smsRequestDTO){
        System.out.println(randomPIN);
        otpServiceDaoimpl.savetodao(smsRequestDTO,String.valueOf(randomPIN));
        return 0;

    }

    @Override
    public String Check(SmsRequestDTO smsRequestDTO) {
      Optional <Otpverify> byphone =  otpRepo.findBymobileno(smsRequestDTO.getPhonenumber());

      System.out.println("otp fetched");

        if (byphone.isPresent()) {

            Otpverify covid1 = byphone.get();



            if (covid1.getOtp().equals(smsRequestDTO.getMessage())){

               System.out.println("truee");

            } else {
                throw new RuntimeException();
            }
        }
        return "send";
    }

    @Override
    public void sendSms(SmsRequestDTO smsRequestDTO) {

        PhoneNumber to = new PhoneNumber(smsRequestDTO.getPhonenumber());
        PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
        this.message = String.valueOf(randomPIN);

        MessageCreator creator =Message.creator(to,from,message);
        creator.create();
    }


}
