package com.example.firstproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("demo")
    public String sayHello(){
        return "hello world";
    }
}
