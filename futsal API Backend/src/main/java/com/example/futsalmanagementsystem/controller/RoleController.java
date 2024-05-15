package com.example.futsalmanagementsystem.controller;

import com.example.futsalmanagementsystem.entity.User;
import com.example.futsalmanagementsystem.pojo.RolePojo;
import com.example.futsalmanagementsystem.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.futsalmanagementsystem.entity.Role;
import java.util.List;

@RestController
@RequestMapping("/roles")
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;
    @GetMapping("/get")
    public ResponseEntity<List<Role>> getRoles() {
        List<Role> roles = roleService.findAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Role> saveRole(@RequestBody RolePojo rolePojo) {
        Role savedRole = roleService.saveRole(rolePojo);
        return new ResponseEntity<>(savedRole, HttpStatus.CREATED);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Role> deleteRole(@PathVariable int id) {
        roleService.deleteRoleById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
