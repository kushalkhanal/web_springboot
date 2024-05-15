package com.example.futsalmanagementsystem.service;
import com.example.futsalmanagementsystem.entity.Role;

import com.example.futsalmanagementsystem.pojo.RolePojo;

import java.util.List;

public interface RoleService {
    List<Role> findAllRoles();
    Role findRoleById(int id);
    void deleteRoleById(int id);
    Role saveRole(RolePojo rolePojo);

}
