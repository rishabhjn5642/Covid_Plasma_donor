package com.example.rishabh.dao.entity;

import javax.persistence.*;


    @Entity
    @Table
    public class CovidUsers {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column
        private Long id;

        @Column
        private String name;
        @Column
        private String phonenumber;
        @Column
        private String password;

        public Float getLongitude() {
            return longitude;
        }

        public void setLongitude(Float longitude) {
            this.longitude = longitude;
        }

        public Float getLatitude() {
            return latitude;
        }

        public void setLatitude(Float latitude) {
            this.latitude = latitude;
        }

        @Column
        private Float longitude;

        @Column
        private Float latitude;

        public Long getId() {
            return id;
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



        public void setId(Long id) {
            this.id = id;
        }



        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    }


