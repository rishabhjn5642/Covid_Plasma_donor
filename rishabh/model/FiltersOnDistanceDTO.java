package com.example.rishabh.model;

public class FiltersOnDistanceDTO {


    private float longitude;
    private float latitude;
    private Long distance;


    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public FiltersOnDistanceDTO(Float longitude, Float latitude, Long distance) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.distance = distance;

    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}


