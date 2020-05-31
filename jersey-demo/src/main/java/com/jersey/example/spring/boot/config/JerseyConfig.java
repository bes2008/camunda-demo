package com.jersey.example.spring.boot.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig {

    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages(true,"com.jersey.example.spring.boot.apis");
        return resourceConfig;
    }

}
