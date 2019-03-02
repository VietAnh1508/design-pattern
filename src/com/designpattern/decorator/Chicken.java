package com.designpattern.decorator;

public class Chicken extends PizzaDecorator {

    private final Pizza pizza;

    Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chicken (12.75)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 12.75;
    }
}
