package com.vkr.myapp.controller;


import com.vkr.myapp.model.Customer;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/sendcustomer")
    public void sendDataToWarehouse(@RequestBody Customer customer) throws Exception{
        producerTemplate.sendBody("direct:customer", customer);
    }
}

