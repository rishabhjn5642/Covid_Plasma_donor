package com.example.rishabh.dao.repository;

import com.example.rishabh.dao.entity.Otpverify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepo extends JpaRepository<Otpverify,Long> {
      Optional<Otpverify> findBymobileno(String mobileno);


}
