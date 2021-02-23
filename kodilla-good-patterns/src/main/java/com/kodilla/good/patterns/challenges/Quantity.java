package com.kodilla.good.patterns.challenges;

public class Quantity {

    private double quantity;
    private String type;

    public Quantity(double quantity, String type) {
        this.quantity = quantity;
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Quantity: " + quantity + type;
    }
}
