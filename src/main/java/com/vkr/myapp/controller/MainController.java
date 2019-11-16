package com.vkr.myapp.controller;


import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @GetMapping(value = "/test")
    public String testMethod()throws Exception{
        producerTemplate.sendBody("direct:test","Hi there!!");
        return "Success";

    }
}

