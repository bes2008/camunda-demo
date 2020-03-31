package com.jerryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.jerryl", "org.activiti"})
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class SpringBootWithActivitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithActivitiApplication.class, args);
    }
}
