package com.designpattern.bridge;

public class CentralLocking implements Product {

    private final String productName;

    CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }

}
