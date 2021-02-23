package com.kodilla.good.patterns.challenges;

import java.text.DecimalFormat;

public class CardPayment implements Payment{

    @Override
    public String processPayment(double price) {
        DecimalFormat dec = new DecimalFormat("#0.00");

        return ("Payment with card processed successfully. You paid " + dec.format(price) + ".");
    }


}
