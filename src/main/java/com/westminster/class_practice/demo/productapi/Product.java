package com.westminster.class_practice.demo.productapi;

public class Product {
    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double price;
    public Product(int id, String name, int qty, double price, boolean inStock) {
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.inStock= inStock;

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;

    }
    public int getQty() {
        return qty;
    }
    public double getPrice() {
        return price;
    }

    public boolean getInStock() {
        return inStock;
    }

}
