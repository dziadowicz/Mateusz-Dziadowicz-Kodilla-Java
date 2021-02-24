package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderService {

    FoodOrder foodOrder;
    FoodSupplier foodSupplier;

    public FoodOrderService(FoodOrder foodOrder, FoodSupplier foodSupplier) {
        this.foodOrder = foodOrder;
        this.foodSupplier = foodSupplier;
    }

    public FoodOrderDTO process(){
        if (foodSupplier.process(foodOrder)) {
            return new FoodOrderDTO(foodOrder.getProduct(), foodOrder.getQuantity(), true);
        } else {
            return new FoodOrderDTO(foodOrder.getProduct(), foodOrder.getQuantity(), false);
        }
    }
}
