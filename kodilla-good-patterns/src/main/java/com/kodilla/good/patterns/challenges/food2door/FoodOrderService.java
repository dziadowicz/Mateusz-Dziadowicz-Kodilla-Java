package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderService {

    FoodOrder foodOrder;

    public FoodOrderService(FoodOrder foodOrder) {
        this.foodOrder = foodOrder;
    }

    public FoodOrderDTO process(){

        FoodSupplier foodSupplier;
        switch (foodOrder.getSupplier()) {
            case "ExtraFoodShop":
                foodSupplier = new ExtraFoodShop();
                break;
            case "GlutenFreeShop":
                foodSupplier = new GlutenFreeShop();
                break;
            case "HealthyShop":
                foodSupplier = new HealthyShop();
                break;
            default:
                return new FoodOrderDTO(foodOrder.getProduct(), foodOrder.getQuantity(), null, false);
        }

        if (foodSupplier.process(foodOrder)) {
            return new FoodOrderDTO(foodOrder.getProduct(), foodOrder.getQuantity(), foodOrder.getSupplier(), true);
        } else {
            return new FoodOrderDTO(foodOrder.getProduct(), foodOrder.getQuantity(), foodOrder.getSupplier(), false);
        }
    }
}
