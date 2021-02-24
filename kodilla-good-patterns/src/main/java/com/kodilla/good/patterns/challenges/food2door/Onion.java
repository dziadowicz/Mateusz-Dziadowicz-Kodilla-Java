package com.kodilla.good.patterns.challenges.food2door;

public class Onion implements Product{

    private String name = "Onion";
    private double price = 2.98;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
