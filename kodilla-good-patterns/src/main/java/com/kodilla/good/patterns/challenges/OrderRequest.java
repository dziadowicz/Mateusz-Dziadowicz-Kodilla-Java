package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private Product product;
    private Quantity quantity;
    private Payment payment;
    private Delivery delivery;

    public OrderRequest(User user, Product product, Quantity quantity, Payment paynment, Delivery delivery) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.payment = paynment;
        this.delivery = delivery;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
