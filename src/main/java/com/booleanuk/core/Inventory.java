package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Products> products;

    public Inventory(){
        products = new ArrayList<>();

        products.add(new Products("BGLO", "Bagel", "Onion", 0.49));
        products.add(new Products("BGLP", "Bagel", "Plain", 0.39));
        products.add(new Products("BGLE", "Bagel", "Everything", 0.49));
        products.add(new Products("BGLS", "Bagel", "Sesame", 0.49));
        products.add(new Products("COFB", "Coffee", "Black", 0.99));
        products.add(new Products("COFW", "Coffee", "White", 1.19));
        products.add(new Products("COFC", "Coffee", "Capuccino", 1.29));
        products.add(new Products("COFL", "Coffee", "Latte", 1.29));
        products.add(new Products("FILB", "Filling", "Bacon", 0.12));
        products.add(new Products("FILE", "Filling", "Egg", 0.12));
        products.add(new Products("FILC", "Filling", "Cheese", 0.12));
        products.add(new Products("FILX", "Filling", "Cream Cheese", 0.12));
        products.add(new Products("FILS", "Filling", "Smoked Salmon", 0.12));
        products.add(new Products("FILH", "Filling", "Ham", 0.12));
    }

    public Products getProduct(int index) {
        return products.get(index);
    }
    
    public Products findBySku(String sku) {
        for (Products product : products) {
            if (product.getSku().equals(sku)) {
                return product;
            }
        }
        return null;
    }
}