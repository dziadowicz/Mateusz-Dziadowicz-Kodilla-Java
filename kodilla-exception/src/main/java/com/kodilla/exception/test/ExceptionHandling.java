package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleException(double a, double b) throws HandledException {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(a, b));
        } catch (Exception e) {
            throw new HandledException();
        } finally {
            System.out.println("Well done!");
        }
    }
}
