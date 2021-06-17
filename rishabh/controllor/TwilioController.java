package com.example.rishabh.controllor;


import com.example.rishabh.service.CovidServices;
import com.example.rishabh.service.impl.ServiceTwilio;
import com.example.rishabh.model.SmsRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/sms")
public class TwilioController {
    @Autowired
    private CovidServices covidServices;


    private final ServiceTwilio serviceTwilio;

    @Autowired
    public TwilioController(ServiceTwilio serviceTwilio) {
        this.serviceTwilio = serviceTwilio;
    }

    @PostMapping("/otp")
    public void sendSms(@RequestBody SmsRequestDTO smsRequestDTO){
        serviceTwilio.sendSms(smsRequestDTO);
    }

    @PostMapping("/verify")
    public String checkOtp(@RequestBody SmsRequestDTO smsRequestDTO)
    {
        return serviceTwilio.checkOtp(smsRequestDTO);
    }
}
