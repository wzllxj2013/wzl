package com.wzl.springboot.controller;

import com.wzl.springboot.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("user")
    public User getUser(){
        return new User("wang");

    }



    @PostMapping("user")
    public User postUser(){
        return new User("wng");

    }



}
