package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent();
        Country poland = new Country(new BigDecimal( "37672367"));
        Country germany = new Country(new BigDecimal("83019200"));
        Country switzerland = new Country(new BigDecimal("8526932"));
        Country italy = new Country(new BigDecimal("60483973"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(switzerland);
        europe.addCountry(italy);
        Continent asia = new Continent();
        Country japan = new Country(new BigDecimal("125710000"));
        Country china = new Country(new BigDecimal("1400050000"));
        Country uzbekistan = new Country(new BigDecimal("33570609"));
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(uzbekistan);
        Continent africa = new Continent();
        Country nigeria = new Country(new BigDecimal("166629000"));
        Country ethiopia = new Country(new BigDecimal("84320987"));
        Country egypt = new Country(new BigDecimal("82868000"));
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("2082851068");
        assertEquals(expectedValue, result);
    }
}
