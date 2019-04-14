package com.designpattern.bridge;

public class GearLocking implements Product {

    private final String productName;

    GearLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }

}
