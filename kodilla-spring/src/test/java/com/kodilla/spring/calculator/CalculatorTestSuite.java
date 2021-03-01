package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        calculator.add(2, 3);
        calculator.sub(3, 2);
        calculator.div(4,0);
        calculator.mul(5, 10);
        //Then
        //do nothing
    }
}
