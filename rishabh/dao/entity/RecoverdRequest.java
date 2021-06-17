package com.example.rishabh.dao.entity;

import javax.persistence.*;

@Entity
@Table()
public class RecoverdRequest {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Long price;

    @Column
    private String bloodgroup;

    @Column
    private  String phonenumber;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

