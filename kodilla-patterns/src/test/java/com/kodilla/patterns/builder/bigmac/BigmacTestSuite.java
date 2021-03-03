package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("With sesame")
                .sauce("standard")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .burgers(2)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals("With sesame", bigmac.getBun());
        assertEquals("standard", bigmac.getSauce());
        assertEquals(2, bigmac.getBurgers());
    }
}
