package com.example.rishabh.model;

public class CovidRequestDTO {

    private String name;

    private String Email;

    private String Password;

    private String CityName;

    private String BloodGroup;

    private Long BidPrice;

    private String Phonenumber;

    private float Longitude;

    private float Latitude;

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    public CovidRequestDTO(String name, String email, String password, String cityName, String bloodGroup, Long bidPrice, Float longitude ,Float latitude,String phonenumber) {
        this.name = name;
        this.Email = email;
        this.Password = password;
        this.CityName = cityName;
        this.BloodGroup = bloodGroup;
        this.BidPrice= bidPrice;
        this.Latitude= latitude;
        this.Longitude=longitude;
        this.Phonenumber=phonenumber;
    }

    public CovidRequestDTO() {

    }

    public CovidRequestDTO(String phonenumber , String password) {
        this.Phonenumber =phonenumber;
        this.Password = password;

    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public Long getBidPrice() {
        return BidPrice;
    }

    public void setBidPrice(Long bidPrice) {
        BidPrice = bidPrice;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }


}


