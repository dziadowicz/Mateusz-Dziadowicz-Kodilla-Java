package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineService {

    public List<Connection> getAllFrom (String from) {

        return AirConnectionsList.getAirConnectionsList().stream()
                .filter(a -> a.getFrom().equals(from)).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Connection> getAllTo (String to) {

        return AirConnectionsList.getAirConnectionsList().stream()
                .filter(a -> a.getTo().equals(to)).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Connection> getAllBy (String by) {

        return AirConnectionsList.getAirConnectionsList().stream()
                .filter(a -> a.getTo().equals(by) || a.getFrom().equals(by))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
