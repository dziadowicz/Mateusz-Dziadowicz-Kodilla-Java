package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        //user test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //calculator test
        Calculator calculator = new Calculator(10,5);

        int addResult = calculator.addNumbers();

        if (addResult == 15) {
            System.out.println("Addition OK");
        } else {
            System.out.println("Addition error!");
        }

        int substractResult = calculator.substractNumbers();

        if (substractResult == 5) {
            System.out.println("Substraction OK");
        } else {
            System.out.println("Substraction error!");
        }
    }
}