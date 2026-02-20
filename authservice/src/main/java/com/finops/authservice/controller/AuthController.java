package com.finops.authservice.controller;

import com.finops.authservice.entity.User;
import com.finops.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // Signup endpoint
    @PostMapping("/signup")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // Temporary login endpoint placeholder
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        // We’ll implement proper login next
        return "Login endpoint is not implemented yet";
    }
}