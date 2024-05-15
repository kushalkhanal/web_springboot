package com.example.futsalmanagementsystem.service;

import com.example.futsalmanagementsystem.entity.Ground;
import com.example.futsalmanagementsystem.entity.User;
import com.example.futsalmanagementsystem.pojo.GroundPojo;
import com.example.futsalmanagementsystem.pojo.UserPojo;

import java.util.List;

public interface GroundService {
    List<Ground> getAllGrounds();
    Ground getGroundById(int id);
    Ground saveGround(GroundPojo groundPojo);
    void deleteGround(int id);
}
