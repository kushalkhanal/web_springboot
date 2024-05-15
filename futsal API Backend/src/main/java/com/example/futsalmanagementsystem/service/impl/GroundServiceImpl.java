package com.example.futsalmanagementsystem.service.impl;

import com.example.futsalmanagementsystem.entity.Ground;
import com.example.futsalmanagementsystem.entity.User;
import com.example.futsalmanagementsystem.pojo.GroundPojo;
import com.example.futsalmanagementsystem.repository.GroundRepository;
import com.example.futsalmanagementsystem.service.GroundService;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class GroundServiceImpl implements GroundService {
    @GeneratedValue
    private GroundRepository groundRepository;
    @Override
    public List<Ground> getAllGrounds() {
        return groundRepository.findAll();
    }

    @Override
    public Ground getGroundById(int id) {
        return groundRepository.findById(id).orElse(null);
    }

    @Override
    public Ground saveGround(GroundPojo groundPojo) {
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setName(groundPojo.getName());
        ground.setLocation(groundPojo.getLocation());
        ground.setPrice(groundPojo.getPrice());
        return groundRepository.save(ground);
    }

    @Override
    public void deleteGround(int id) {
        groundRepository.deleteById(id);

    }
}
