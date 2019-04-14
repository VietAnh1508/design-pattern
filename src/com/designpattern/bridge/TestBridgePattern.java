package com.designpattern.bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        Product centralLocking = new CentralLocking("Central Locking system");
        Product gearLocking = new GearLocking("Gear Locking system");

        Car bigWheel = new BigWheel(centralLocking, "BigWheel xz model");
        bigWheel.produceProduct();
        bigWheel.assemble();
        bigWheel.printDetails();

        bigWheel = new BigWheel(gearLocking, "BigWheel xz model");
        bigWheel.produceProduct();
        bigWheel.assemble();
        bigWheel.printDetails();

        Car motoren = new Motoren(centralLocking, "Motoren lm model");
        motoren.produceProduct();
        motoren.assemble();
        motoren.printDetails();

        motoren = new Motoren(gearLocking, "Motoren lm model");
        motoren.produceProduct();
        motoren.assemble();
        motoren.printDetails();
    }

}
