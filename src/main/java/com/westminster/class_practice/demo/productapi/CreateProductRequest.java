package com.westminster.class_practice.demo.productapi;

public record CreateProductRequest(
        String name,
        int qty,
        boolean inStock,
        double unitPrice

) {
}
