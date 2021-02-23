package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    private User user = new User("John", "Matejko");
    private Product product = new Apple("Reneta", 4.99);
    private Quantity quantity = new Quantity(2.5, "kg");
    private Payment payment = new CardPayment();
    private Delivery delivery = new FedExDelivery("Kraków, ul. Krakowska 21/37", 2, 10.99);

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
