package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    void createOrder(User user, Product product, Quantity quantity, Payment payment, Delivery delivery);
}
