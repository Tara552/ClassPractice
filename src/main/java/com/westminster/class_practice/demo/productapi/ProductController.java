package com.westminster.class_practice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/products")
    public class ProductController{

        @GetMapping("/{id}")
        public Product getById(@PathVariable int id){
            return new Product(
                    id, "Laptop", 10,  99.99, true);

//            Product product = new Product(id, "Laptop", 10,  99.99, true);
//            return product;
        }
    }

