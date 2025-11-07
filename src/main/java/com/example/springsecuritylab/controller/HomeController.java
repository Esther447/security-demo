package com.example.springsecuritylab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the public homepage!";
    }

    @GetMapping("/secure")
    public String secure() {
        return "This is a secured page. You are logged in.";
    }
}
