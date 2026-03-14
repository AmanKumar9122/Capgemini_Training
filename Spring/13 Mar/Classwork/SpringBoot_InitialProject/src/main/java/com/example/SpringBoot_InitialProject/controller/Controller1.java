package com.example.SpringBoot_InitialProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller1 {

    @GetMapping("/h1")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/h2")
    public String hello2() {
        return "Hello2";
    }
}
