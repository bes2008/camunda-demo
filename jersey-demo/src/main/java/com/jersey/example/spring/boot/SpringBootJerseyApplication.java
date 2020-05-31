package com.jersey.example.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jersey.example.spring.boot")
public class SpringBootJerseyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJerseyApplication.class, args);
    }
}
