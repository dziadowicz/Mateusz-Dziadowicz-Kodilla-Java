package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Date;

public class FedExDelivery implements Delivery{

    private String adress;
    private int deliveryTime;
    private double deliveryCost;

    public FedExDelivery(String adress, int deliveryTime, double deliveryCost) {
        this.adress = adress;
        this.deliveryTime = deliveryTime;
        this.deliveryCost = deliveryCost;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public int getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public double getDeliveryCost() {
        return deliveryCost;
    }

    @Override
    public String toString() {
        return "FedExDelivery: " + adress + "\nexpected time of delivery: " + LocalDate.now().plusDays(deliveryTime) + "\ncost of delivery: " + deliveryCost;
    }
}
