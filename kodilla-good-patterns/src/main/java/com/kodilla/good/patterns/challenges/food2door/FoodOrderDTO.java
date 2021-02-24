package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderDTO {

    private Product product;
    private Quantity quantity;
    private boolean isOrdered;

    public FoodOrderDTO(Product product, Quantity quantity, boolean isOrdered) {
        this.product = product;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
