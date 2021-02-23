package com.kodilla.good.patterns.challenges;

public interface OrderService {

    boolean order(User user, Product product, Quantity quantity, Payment payment, Delivery delivery);
}
