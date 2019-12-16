package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avenger/assemble")
    public String admin() {
        return "Avenger assemble";
    }

    @GetMapping("/secret-bases")
    public String bases() {
        return "En fait les bases sont secrètes, LOL";
    }
}
