package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrder {

    private Product product;
    private Quantity quantity;

    public FoodOrder(Product product, Quantity quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
