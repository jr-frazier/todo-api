package com.luv2code.springboot.todoapi.controller;

import com.luv2code.springboot.todoapi.entity.User;
import com.luv2code.springboot.todoapi.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "User REST API Endpoints", description = "Operations related to user")
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/info")
    public User getUserInfo() {
        return userService.getUserInfo();
    }
}
