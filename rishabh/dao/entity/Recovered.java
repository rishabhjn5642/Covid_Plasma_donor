package com.example.rishabh.dao.entity;


import javax.persistence.*;



@Entity
@Table
public class Recovered {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;
    @Column
    private String Email;
    @Column
    private String password;
    @Column
    private String CityName;
    @Column
    private String BloodGroup;
    @Column
    private Long BidPrice;

    @Column
    private String phonenumber;

    @Column
    private float latitude;

    @Column
    private float longitude;

    @Column
    private boolean testvalue;

    public boolean isTestvalue() {
        return testvalue;
    }

    public void setTestvalue(boolean testvalue) {
        this.testvalue = testvalue;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Long getBidPrice() {
        return BidPrice;
    }

    public void setBidPrice(Long bidPrice) {
        BidPrice = bidPrice;
    }
}
