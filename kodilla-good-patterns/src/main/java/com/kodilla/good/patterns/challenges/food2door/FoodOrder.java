package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrder {

    private Product product;
    private Quantity quantity;
    private String supplier;

    public FoodOrder(Product product, Quantity quantity, String supplier) {
        this.product = product;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public String getSupplier() {
        return supplier;
    }
}
