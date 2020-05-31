package com.jersey.example.spring.boot.apis;

import com.jersey.example.spring.boot.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Component
@Path("helloworld")
public class HelloEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(HelloEndpoint.class);
    @Autowired
    private HelloWorldService service;

    @Path("hello")
    public String hello(String text) {
        String response = service.sayHello(text);
        logger.info(response);
        return response;
    }
}
