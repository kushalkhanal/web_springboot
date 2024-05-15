package com.example.futsalmanagementsystem.controller;

import com.example.futsalmanagementsystem.entity.Ground;
import com.example.futsalmanagementsystem.entity.User;
import com.example.futsalmanagementsystem.pojo.GroundPojo;
import com.example.futsalmanagementsystem.pojo.UserPojo;
import com.example.futsalmanagementsystem.service.GroundService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grounds")
@AllArgsConstructor
public class GroundController {
    @Autowired
    private GroundService groundService;
    @GetMapping("/get")
    public ResponseEntity<List<Ground>> getAllUsers() {
        List<Ground> grounds = groundService.getAllGrounds();
        return new ResponseEntity<>(grounds, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ground> getGroundById(@PathVariable int id) {
        Ground ground = groundService.getGroundById(id);
        return ground != null ? new ResponseEntity<>(ground, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/save")
    public ResponseEntity<Ground> createGround(@RequestBody GroundPojo groundPojo) {
        Ground createdGround = groundService.saveGround(groundPojo);
        return new ResponseEntity<>(createdGround, HttpStatus.CREATED);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGround(@PathVariable int id) {
        groundService.deleteGround(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
