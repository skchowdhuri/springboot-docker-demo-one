package com.sagor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String greeting(){
        return "<h2>This is Greeting app from Spring boot</h2>";
    }
}
