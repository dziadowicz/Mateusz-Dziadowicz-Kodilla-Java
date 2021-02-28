package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {

    @Autowired
    private Display display;

    public void add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
    }

    public void sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
    }

    public void mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
    }

    public void div(double a, double b) {
        if (b!=0) {
            double result = a / b;
            display.displayValue(result);
        }
    }
}
