package com.example.rishabh.dao.repository;

import com.example.rishabh.dao.entity.RecoverdRequest;
import com.example.rishabh.dao.entity.Recovered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResponseRepo extends JpaRepository<RecoverdRequest,Long>{
        Optional<RecoverdRequest> findByPhonenumber(String phonenumber);

}
