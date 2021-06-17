package com.example.rishabh.model;

public class CovidResponse extends CovidRequestDTO {

    private Long id;

   private boolean value=false;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public CovidResponse(String name,
                         String email,
                         String password,
                         String cityName, String bloodGroup, Long bidPrice, Float latitude, Float longitude, String phonenumber) {



        super(name,email,password,cityName,bloodGroup,bidPrice,latitude,longitude,phonenumber);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
