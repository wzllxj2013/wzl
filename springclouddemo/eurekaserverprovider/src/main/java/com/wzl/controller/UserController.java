package com.wzl.controller;

import com.wzl.entity.user;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("user")
    public user grtUser(){

        return new user("xiaoming ");

    }
}
