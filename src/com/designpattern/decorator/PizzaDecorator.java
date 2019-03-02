package com.designpattern.decorator;

public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDescription() {
        return "Topping";
    }

}
