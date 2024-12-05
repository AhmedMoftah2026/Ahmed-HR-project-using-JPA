package com.ahmed.hr.service;

import com.ahmed.hr.model.Role;
import com.ahmed.hr.reposatory.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public Role findById(Long id) {

        return roleRepo.findById(id).orElseThrow();
    }

    public Role insert(Role role) {

        return roleRepo.save(role);
    }

    public Role update(Role role) {

        Role current = roleRepo.findById(role.getId()).orElseThrow();

        current.setName(role.getName());

        return roleRepo.save(current);
    }

    public List<Role> findAll() {

        return roleRepo.findAll();
    }

    public Role findByName (String name) {

        return roleRepo.findByName(name);
    }

}
