package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderRetriever {
    private FoodSupplier foodSupplier = new ExtraFoodShop();
    private Product product = new Onion();
    private Quantity quantity = new Quantity(25, "kg");

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public Product getProduct() {
        return product;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
