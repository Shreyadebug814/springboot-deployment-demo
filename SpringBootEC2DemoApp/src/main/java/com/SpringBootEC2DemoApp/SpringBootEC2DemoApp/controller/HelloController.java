package com.SpringBootEC2DemoApp.SpringBootEC2DemoApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello from Spring Boot on EC2!";
    }

}
