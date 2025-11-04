package com.example.springsecuritylab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring Security Lab");
        return "home";
    }

    @GetMapping("/secured")
    public String secured(Model model) {
        model.addAttribute("message", "Welcome! You are logged in!");
        return "secured";
    }
}
