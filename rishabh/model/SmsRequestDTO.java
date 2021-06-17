package com.example.rishabh.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class SmsRequestDTO {


    private String phonenumber;
    private String message;


    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SmsRequestDTO(@JsonProperty("phonenumber") String phonenumber, @JsonProperty("message") String message){
        this.phonenumber = phonenumber;
        this.message=message;

    }



    public String getPhonenumber() {
        return phonenumber;
    }


    @Override
    public String toString() {
        return "SmsRequest{" +
                "phonenumber='" + phonenumber + '\'' +
                ", message='" + '\'' +
                '}';
    }
}
