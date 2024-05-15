package com.example.futsalmanagementsystem.service.impl;

import com.example.futsalmanagementsystem.pojo.RolePojo;
import com.example.futsalmanagementsystem.repository.RoleRepository;
import com.example.futsalmanagementsystem.service.RoleService;
import com.example.futsalmanagementsystem.entity.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor

public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleById(int id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteRoleById(int id) {
        roleRepository.deleteById(id);

    }

    @Override
    public Role saveRole(RolePojo rolePojo) {
        Role role = new Role();
        role.setId(rolePojo.getId());
        role.setRole(rolePojo.getRoleName());
        return roleRepository.save(role);
    }
}
