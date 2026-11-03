package com.westminster.class_practice.demo.productapi;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    double discountedPrice;

    public DigitalProduct(int id, String name, int qty, boolean inStock, double unitPrice,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, qty, inStock, unitPrice);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public double getFileSizeMB() {
        return this.fileSizeMB;
    }
    @Override
    public String getSummary() {
        return "Digital: " + getName() + " | " + getDownloadUrl();
    }

    @Override
    public void applyDiscountable(double rate) {
        discountedPrice = getUnitPrice() * (1 - rate);


    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
