package com.example.rishabh.model;

public class RequestPendingDetailsDTO {

    private String name;

    private Long price;

    private String bloodgroup;

    private String phonenumber;

    public RequestPendingDetailsDTO(String name, Long price, String bloodgroup, String phonenumber) {
        this.name = name;
        this.price = price;
        this.bloodgroup = bloodgroup;
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
}
