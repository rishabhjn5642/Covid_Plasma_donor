package com.example.rishabh.service.Config;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInliz {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInliz.class);

    private final TwilioConfig twilioConfig;

    @Autowired
    public TwilioInliz(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
        Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());

        LOGGER.info("twilio inialised ... with account sid {}", twilioConfig.getAccountSid());


    }
}
