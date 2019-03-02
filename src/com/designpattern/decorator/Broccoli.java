package com.designpattern.decorator;

public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;

    Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Broccoli (9.25)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 9.25;
    }

}
