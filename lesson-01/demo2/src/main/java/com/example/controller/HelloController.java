package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by secretgarden on 12/11/2016 AD.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "Hello Java Spring Boot!";
    }
}
