package com.kodilla.good.patterns.challenges.food2door;

import java.text.DecimalFormat;

public class ExtraFoodShop implements FoodSupplier {

    @Override
    public boolean process(FoodOrder foodOrder) {

        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println("New order:\nProduct: " + foodOrder.getProduct().getName() +"\nQuantity: " + foodOrder.getQuantity().getQuantity()
                + "\nTotal price: " + dec.format(foodOrder.getQuantity().getQuantity()*foodOrder.getProduct().getPrice()));
        return true;
    }
}
