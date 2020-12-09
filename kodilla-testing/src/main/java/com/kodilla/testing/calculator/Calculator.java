package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addNumbers() {
        return (a + b);
    }

    public int substractNumbers() {
        return (a - b);
    }
}