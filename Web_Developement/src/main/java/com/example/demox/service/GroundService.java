package com.example.demox.service;


import com.example.demox.Pojo.GroundPojo;
import org.springframework.stereotype.Repository;
import com.example.demox.entity.Ground ;

import java.util.List;
import java.util.Optional;
@Repository

public interface GroundService {
    Ground saveData(GroundPojo groundPojo);

    List<Ground> getAll();
    void deleteById(int id);
    Optional<Ground> findById(int id);
}