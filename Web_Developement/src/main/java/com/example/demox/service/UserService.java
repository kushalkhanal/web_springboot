package com.example.demox.service;

import com.example.demox.Pojo.UserPojo;
import com.example.demox.entity.Ground;
import com.example.demox.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserService {
   User saveUser(UserPojo userPojo) ;
   List<User> getAll() ;

   void deleteById(int id);
   Optional<Ground> findById(int id);
}
