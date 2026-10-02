package com.westminster.class_practice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/api/product")
    public String hello(){
        return "Hello Tara from Java.";
    }
}
