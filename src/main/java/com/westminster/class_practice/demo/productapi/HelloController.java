package com.westminster.class_practice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/api/product")

    public String hello() {


        Address address = new Address(1, "Home", "Bagmati", "Kathmandu", "Nepal");

        Person person = new Person(1, "John", "2000-05-15");

        String fullAddress = address.getFullAddress();
        String personDetails = person.getAge();

        return "Hello from java" +" ,   " + "My address is " + address.getFullAddress() + " | " + person.getAge();

    }
}
