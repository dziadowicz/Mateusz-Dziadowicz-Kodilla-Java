package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continentList = new ArrayList<>();

    public void addContinent (Continent continent) {
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeopleQuantity = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalPeopleQuantity;
    }
}
