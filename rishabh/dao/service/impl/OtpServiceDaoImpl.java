package com.example.rishabh.dao.service.impl;

import com.example.rishabh.dao.entity.Otpverify;
import com.example.rishabh.dao.repository.OtpRepo;
import com.example.rishabh.model.SmsRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtpServiceDaoImpl {
    @Autowired
    private OtpRepo otpRepo;

    Otpverify otpverify = new Otpverify();

    public OtpServiceDaoImpl() {


    }


    public void savetodao(SmsRequestDTO smsRequestDTO, String message)
    {
        otpverify.setMobileno(smsRequestDTO.getPhonenumber());

        otpverify.setOtp(message);

        Otpverify o = otpRepo.save(otpverify);




    }




}
