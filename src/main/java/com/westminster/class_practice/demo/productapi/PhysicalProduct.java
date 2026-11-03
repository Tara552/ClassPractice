package com.westminster.class_practice.demo.productapi;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private  String dimensions;
    double discountedPrice;

    public PhysicalProduct() {

    }
    public PhysicalProduct(int id, String name, int qty, boolean inStock,
                           double unitPrice, double weightKg, String dimensions) {
        super(id, name, qty, inStock, unitPrice);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions(){
        return dimensions;
    }
    @Override
    public String getSummary(){
        return "Physical: " + getName() + " | " + weightKg + "kg";
        
    }

    @Override
    public void applyDiscountable(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getUnitPrice() * (1 - capped);

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}


