package com.example.rishabh.service.impl;

import com.example.rishabh.model.SmsRequestDTO;
import com.example.rishabh.service.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class ServiceTwilio {


    private final SmsSender smsSender;

    @Autowired
    public ServiceTwilio(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void sendSms(SmsRequestDTO smsRequestDTO){
        smsSender.sendSms(smsRequestDTO);
        smsSender.savedao(smsRequestDTO);
    }

    public String checkOtp(SmsRequestDTO smsRequestDTO){
       return  smsSender.Check(smsRequestDTO);

    }


}
