package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private User user;
    private Product product;
    private Quantity quantity;
    private Payment payment;
    private Delivery delivery;
    private Boolean isOrdered;

    public OrderDto(User user, Product product, Quantity quantity, Payment payment, Delivery delivery, Boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.payment = payment;
        this.delivery = delivery;
        this.isOrdered = isOrdered;
    }
}
