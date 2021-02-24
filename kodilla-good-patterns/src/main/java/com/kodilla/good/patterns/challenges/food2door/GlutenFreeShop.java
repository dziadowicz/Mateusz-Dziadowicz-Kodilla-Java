package com.kodilla.good.patterns.challenges.food2door;

import java.text.DecimalFormat;

public class GlutenFreeShop implements FoodSupplier{

    @Override
    public boolean process(FoodOrder foodOrder) {

        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println("Order in GlutenFreeShop processed.\nProduct name: " + foodOrder.getProduct().getName() +"\nQuantity: " + foodOrder.getQuantity().getQuantity() + foodOrder.getQuantity().getType()
                + "\nTotal price: " + dec.format(foodOrder.getQuantity().getQuantity()*foodOrder.getProduct().getPrice()));
        return true;
    }
}
