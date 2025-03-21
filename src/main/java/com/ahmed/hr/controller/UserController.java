package com.ahmed.hr.controller;

import com.ahmed.hr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/role/{roleName}")
    public ResponseEntity<?> addRoleForAllUsers(@PathVariable String roleName) {

        userService.addRoleForAllUsers(roleName);

        return ResponseEntity.ok(null);
    }

}