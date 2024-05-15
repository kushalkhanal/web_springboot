package com.example.futsalmanagementsystem.repository;

import com.example.futsalmanagementsystem.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroundRepository extends JpaRepository<Ground, Integer> {
}
