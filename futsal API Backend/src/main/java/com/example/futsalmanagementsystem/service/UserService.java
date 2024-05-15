package com.example.futsalmanagementsystem.service;

import com.example.futsalmanagementsystem.entity.User;
import com.example.futsalmanagementsystem.pojo.GroundPojo;
import com.example.futsalmanagementsystem.pojo.UserPojo;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User saveUser(UserPojo userPojo);
    void deleteUser(int id);

    User updateUser(int id, UserPojo userPojo);
}
