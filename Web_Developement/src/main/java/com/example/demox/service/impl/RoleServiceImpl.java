package com.example.demox.service.impl;

import com.example.demox.Pojo.RolePojo;
import com.example.demox.Repository.RoleRespository;
import com.example.demox.entity.Role;
import com.example.demox.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Repository
@RequiredArgsConstructor

public class RoleServiceImpl implements RoleService {
    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    private  final RoleRespository roleRespository ;



    public Role saveData(RolePojo rolePojo){
        Role role  = new Role() ;
        role.setRoleName(rolePojo.getRoleName()); ;
        role.setRoleType(rolePojo.getRoleType()); ;

        roleRespository.save(role) ;
        return role;
    }
}
