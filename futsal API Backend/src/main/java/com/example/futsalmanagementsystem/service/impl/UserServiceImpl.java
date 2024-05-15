package com.example.futsalmanagementsystem.service.impl;

import com.example.futsalmanagementsystem.entity.User;
import com.example.futsalmanagementsystem.pojo.UserPojo;
import com.example.futsalmanagementsystem.repository.UserRepository;
import com.example.futsalmanagementsystem.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User saveUser(UserPojo userPojo) {
        if (userPojo.getUsername() == null || userPojo.getEmail() == null || userPojo.getPassword() == null || userPojo.getPhone() == null) {
            throw new IllegalArgumentException("Required fields cannot be null");
        }
        User user = new User();
        user.setId(userPojo.getId());
        user.setName(userPojo.getUsername());
        user.setPassword(userPojo.getPassword());
        user.setEmail(userPojo.getEmail());
        user.setPhone(userPojo.getPhone());
        return userRepository.save(user);

    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
    @Override
    public User updateUser(int id, UserPojo userPojo){
        User user = userRepository.findById(id).orElse(null);
        user.setName(userPojo.getUsername());
        user.setPassword(userPojo.getPassword());
        user.setEmail(userPojo.getEmail());
        user.setPhone(userPojo.getPhone());
        return userRepository.save(user);
    }
}
