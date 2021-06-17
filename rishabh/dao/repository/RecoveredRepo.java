package com.example.rishabh.dao.repository;

import com.example.rishabh.dao.entity.Recovered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecoveredRepo extends JpaRepository<Recovered,Long> {


//      Optional<Recovered> findbyphonenumber(String phonenumber);
//}
}
