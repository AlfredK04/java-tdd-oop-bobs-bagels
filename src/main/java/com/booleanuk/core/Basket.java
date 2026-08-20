package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, Integer> basket;

    public Basket() {
        this.basket = new HashMap<>();
    }

    public void addToBasket(String sku, int quantity) {
        basket.put(sku, quantity);
    }

    public Map<String, Integer> getBasket() {
        return basket;
    }
}
