package com.jersey.example.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {
    @GetMapping("/spring-rest-demo")
    public String showDemo() {
        return "this is a spring rest demo";
    }
}
