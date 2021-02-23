package com.kodilla.good.patterns.challenges;

public class Apple implements Product{

    private String name;
    private double price;

    public Apple(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: apple "+ name;
    }
}
