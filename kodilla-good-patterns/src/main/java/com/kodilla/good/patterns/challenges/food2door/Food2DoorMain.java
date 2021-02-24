package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorMain {

    public static void main(String[] args) {

        FoodOrderRetriever foodOrderRetriever = new FoodOrderRetriever();
        FoodOrder foodOrder = new FoodOrder(foodOrderRetriever.getProduct(), foodOrderRetriever.getQuantity());
        FoodOrderService foodOrderService = new FoodOrderService(foodOrder, new ExtraFoodShop());
        if (foodOrderService.process().isOrdered()) {
            System.out.println("Order done successfully.");
        } else {
            System.out.println("Some problem happened. Try again later");
        }
    }
}
