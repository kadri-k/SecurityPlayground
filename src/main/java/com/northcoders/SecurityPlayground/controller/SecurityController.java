package com.northcoders.SecurityPlayground.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1")
public class SecurityController {

    @GetMapping("/open/greeting")
    public String openGreeting() {
        return "Hello";
    }
    @GetMapping("/protected/greeting")
    public String protectedGreeting() {
        return "Secure";
    }

}
