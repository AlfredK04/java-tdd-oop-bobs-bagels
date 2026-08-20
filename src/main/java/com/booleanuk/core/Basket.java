package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, Integer> basket;
    private int maxQuantity = 4;

    public Basket() {
        this.basket = new HashMap<>();
        this.maxQuantity = 4;
    }

    public void addToBasket(String sku, int quantity) {
        if (getMaxQuantity() + quantity > maxQuantity) {
            throw new IllegalStateException("Basket is full");
        }
        basket.put(sku, quantity);
    }

    public Map<String, Integer> getBasket() {
        return basket;
    }

    public void removeFromBasket(String sku, int quantity) {
        int currentQuantity = basket.get(sku);
        int newQuantity = currentQuantity - quantity;
        if (newQuantity <= 0) {
            basket.remove(sku);
        } else {
            basket.put(sku, newQuantity);
        }
    }

    public int getMaxQuantity() {
        int total = 0;
        for (int quantity : basket.values()) {
            total += quantity;
        }
        return total;
    }

    public void changeMaxQuantity(int newMaxQuantity) {
        this.maxQuantity = newMaxQuantity;
    }
}
