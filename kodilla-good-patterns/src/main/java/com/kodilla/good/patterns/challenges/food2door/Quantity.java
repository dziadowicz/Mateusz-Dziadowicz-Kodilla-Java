package com.kodilla.good.patterns.challenges.food2door;

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
}
