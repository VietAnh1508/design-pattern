package com.designpattern.decorator;

import java.text.DecimalFormat;

public class TestDecoratorPattern {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();

        pizza = new Broccoli(pizza);
        pizza = new FetaCheese(pizza);

        System.out.println("Desc: " + pizza.getDescription());
        System.out.println("Price: " + decimalFormat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();

        pizza = new Cheese(pizza);
        pizza = new Chicken(pizza);

        System.out.println("Desc: " + pizza.getDescription());
        System.out.println("Price: " + decimalFormat.format(pizza.getPrice()));
    }

}
