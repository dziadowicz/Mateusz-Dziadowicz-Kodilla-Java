package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderDTO {

    private Product product;
    private Quantity quantity;
    private String supplier;
    private boolean isOrdered;

    public FoodOrderDTO(Product product, Quantity quantity, String supplier, boolean isOrdered) {
        this.product = product;
        this.quantity = quantity;
        this.supplier = supplier;
        this.isOrdered = isOrdered;
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

    public boolean isOrdered() {
        return isOrdered;
    }
}
