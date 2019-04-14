package com.designpattern.bridge;

public abstract class Car {

    private final Product product;

    private final String carType;

    Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    void printDetails(){
        System.out.println("Car: " + carType + ", Product: " + product.getName());
    }

}
