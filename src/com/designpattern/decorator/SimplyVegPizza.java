package com.designpattern.decorator;

public class SimplyVegPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Simply Veg Pizza (230)";
    }

    @Override
    public double getPrice() {
        return 230;
    }

}
