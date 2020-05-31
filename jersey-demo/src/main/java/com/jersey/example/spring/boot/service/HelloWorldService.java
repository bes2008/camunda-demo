package com.jersey.example.spring.boot.service;

import com.jn.langx.text.StringTemplates;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String sayHello(String hello) {
        return StringTemplates.formatWithPlaceholder("Spring Hello Service: {}", hello);
    }
}
