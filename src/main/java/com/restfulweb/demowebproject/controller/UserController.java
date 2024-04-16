package com.restfulweb.demowebproject.controller;

import com.restfulweb.demowebproject.model.UserLogin;
import com.restfulweb.demowebproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/User")
        public ResponseEntity<String> createUser (@RequestBody UserLogin user ){

            return userService.createUser(user);

        }
    @GetMapping("/User/{userName}")
    public ResponseEntity<String> getUser (@PathVariable String userName ){

        return userService.getUser(userName);

    }
    }