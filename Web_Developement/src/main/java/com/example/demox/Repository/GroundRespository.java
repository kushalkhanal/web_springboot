package com.example.demox.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demox.entity.Ground ;

import java.util.List;


//@Repository
public interface GroundRespository extends JpaRepository<Ground,Integer> {
//    List<Ground> findByGroundNameContaining(String groundName);
}
