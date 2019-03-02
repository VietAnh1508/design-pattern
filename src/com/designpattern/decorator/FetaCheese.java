package com.designpattern.decorator;

public class FetaCheese extends PizzaDecorator {

    private final Pizza pizza;

    FetaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Feta Cheese (25.88)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 25.88;
    }

}
