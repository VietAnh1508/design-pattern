package com.designpattern.bridge;

public class Motoren extends Car {

    private final Product product;

    private final String carType;

    Motoren(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.getName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifying product " + product.getName() + " according to " + carType);
    }

}
