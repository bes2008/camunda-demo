package com.jersey.example.spring.boot.apis;

import com.jersey.example.spring.boot.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("helloworld")
public class HelloEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(HelloEndpoint.class);
    @Autowired
    private HelloWorldService service;

    @GET
    @Path("hello")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("text") String text) {
        String response = service.sayHello(text);
        logger.info(response);
        return response;
    }
}
