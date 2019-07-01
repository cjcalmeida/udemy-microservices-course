package com.cjcalmeida.course.microservice.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersControllers {

    private Environment env;

    @Autowired
    public UsersControllers(Environment env) {
        this.env = env;
    }

    @GetMapping("/status/check")
    public String status() {
        return "Running on port: "+env.getProperty("local.server.port");
    }
}
