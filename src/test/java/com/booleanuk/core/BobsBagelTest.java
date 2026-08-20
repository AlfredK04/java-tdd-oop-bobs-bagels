package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BobsBagelTest {
    @Test
    public void testTest() {
        Inventory inv = new Inventory();
        Assertions.assertEquals("BGLO", inv.getProduct(0).getSKU());
    }
    
}