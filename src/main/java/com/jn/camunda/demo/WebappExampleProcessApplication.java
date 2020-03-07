package com.jn.camunda.demo;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableProcessApplication
public class WebappExampleProcessApplication {
    @Autowired
    private RuntimeService bpmnRuntime;

    @EventListener
    private void processPostDeploy(PostDeployEvent event) {
        bpmnRuntime.startProcessInstanceByKey("payment_retrieval_process");
    }

    public static void main(String[] args) {
        SpringApplication.run(WebappExampleProcessApplication.class, args);
    }
}
