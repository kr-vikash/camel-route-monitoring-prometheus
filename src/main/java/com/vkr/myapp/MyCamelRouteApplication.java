package com.vkr.myapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vkr.myapp")
public class MyCamelRouteApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyCamelRouteApplication.class);
    }
}
