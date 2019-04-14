package com.designpattern.bridge;

public class BigWheel extends Car {

    private final Product product;

    private final String carType;

    BigWheel(Product product, String carType) {
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
