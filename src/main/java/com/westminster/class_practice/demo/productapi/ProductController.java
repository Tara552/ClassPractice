package com.westminster.class_practice.demo.productapi;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/products")
public class ProductController{

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/")
    public List<Product> all() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return productService.getProductById(id)
                .orElse(null); // Lecture 6
    }

    @PostMapping("/")
    public Product add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/inherited")
    public List<Product> inherited() {
        return productService.addGetInheritedProduct();
    }

    @GetMapping("/override")
    public List<String> override() {
        productService.addGetInheritedProduct();
        List<String> overrideList = new ArrayList<>();
        productService.getAllProducts().forEach(product -> {
            overrideList.add(product.getSummary());
        });
        return overrideList;
    }
}




