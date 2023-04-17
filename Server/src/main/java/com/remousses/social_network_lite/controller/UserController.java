package com.remousses.social_network_lite.controller;

import com.remousses.social_network_lite.model.dto.UserDto;
import com.remousses.social_network_lite.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping
    public List<UserDto> getAll() {
        return userService.findTest();
    }

    @GetMapping("/test")
    public String test() {
        return "hehe";
    }
}
