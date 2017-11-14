package com.learning.springsecurityldapexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping("/check")
    public String check(){
        return "Check worked!";
    }
}
