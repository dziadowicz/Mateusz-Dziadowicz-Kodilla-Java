package com.kodilla.good.patterns.challenges;

public class BuyNowOrderService implements OrderService{

    @Override
    public boolean order(User user, Product product, Quantity quantity, Payment payment, Delivery delivery) {
        return true;
    }
}
