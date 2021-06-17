package com.example.rishabh.service;

import com.example.rishabh.model.SmsRequestDTO;

public interface SmsSender {
    void sendSms(SmsRequestDTO smsRequestDTO);
    int savedao(SmsRequestDTO smsRequestDTO);
    String Check(SmsRequestDTO smsRequestDTO);
}
