package com.booleanuk.core;

public class Products {
    private String sku;
    private String name;
    private String variant;
    private double price;

    public Products(String sku, String name, String variant, double price) {
        this.sku = sku;
        this.name = name;
        this.variant = variant;
        this.price = price;
    }

    public String getSku(){
        return sku;
    }

    public double getPrice() {
        return price;
    }
    
}