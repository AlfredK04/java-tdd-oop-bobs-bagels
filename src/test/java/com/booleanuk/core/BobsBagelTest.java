package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BobsBagelTest {
    @Test
    public void findSku() {
        Inventory inv = new Inventory();
        Assertions.assertEquals("BGLO", inv.getProduct(0).getSku());
    }
    
    @Test
    public void addBasket() {
        Basket basket = new Basket();
        basket.addToBasket("BGLO", 2);
        Assertions.assertEquals(2, basket.getBasket().get("BGLO"));
    }
}