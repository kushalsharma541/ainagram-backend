package com.ainagram.ainagrambackend.controller;

import com.ainagram.ainagrambackend.dto.UserResponseDTO;
import com.ainagram.ainagrambackend.model.User;
import com.ainagram.ainagrambackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserResponseDTO register(@RequestBody User user) {
        return userService.registerUser(user);
    }
    @PostMapping("/login")
    public UserResponseDTO login(@RequestBody User user) {
        return userService.loginUser(user.getEmail(), user.getPassword());
    }
}