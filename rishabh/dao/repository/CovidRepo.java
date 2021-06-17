package com.example.rishabh.dao.repository;

import com.example.rishabh.dao.entity.CovidUsers;
import com.example.rishabh.dao.entity.Otpverify;
import com.example.rishabh.dao.entity.Recovered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CovidRepo extends JpaRepository<CovidUsers,Long> {
    Optional<CovidUsers> findByPhonenumber(String phonenumber);
    Optional<CovidUsers> findByUsers(String datetime);

}
