package com.kodilla.good.patterns.challenges.food2door;

import java.text.DecimalFormat;

public class HealthyShop implements FoodSupplier {

    @Override
    public boolean process(FoodOrder foodOrder) {

        System.out.println("Order in HealthyShop is temporary uavailable");
        return false;
    }
}
