package com.kodilla.good.patterns.challenges;

import javax.xml.stream.events.StartDocument;

public class BuyNowRepository implements OrderRepository{

    @Override
    public void createOrder(User user, Product product, Quantity quantity, Payment payment, Delivery delivery) {
        double totalPrice = product.getPrice()* quantity.getQuantity();
        System.out.println("New order created:\n" + user.toString() + "\n" + product.toString() + "\n" + quantity.toString() + "\n" + payment.processPayment(totalPrice) + "\n" + delivery.toString());
    }
}
