package com.example.futsalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.futsalmanagementsystem.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
