package com.designpattern.decorator;

public class SimplyNonVegPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Simply Non Veg Pizza (350)";
    }

    @Override
    public double getPrice() {
        return 350;
    }

}
