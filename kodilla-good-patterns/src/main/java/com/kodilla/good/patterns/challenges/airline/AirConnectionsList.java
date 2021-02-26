package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;

public class AirConnectionsList {

    public static List<Connection> getAirConnectionsList() {

        List<Connection> airConnectionsList = new ArrayList<>();
        airConnectionsList.add(new AirConnection("Warsaw", "Cracow"));
        airConnectionsList.add(new AirConnection("Warsaw", "Paris"));
        airConnectionsList.add(new AirConnection("Bologna", "Cracow"));
        airConnectionsList.add(new AirConnection("Paris", "Zurich"));
        airConnectionsList.add(new AirConnection("Zurich", "Rome"));
        airConnectionsList.add(new AirConnection("Rome", "Cracow"));
        airConnectionsList.add(new AirConnection("London", "Paris"));
        airConnectionsList.add(new AirConnection("Rome", "Bologna"));
        airConnectionsList.add(new AirConnection("Bologna", "Cracow"));
        airConnectionsList.add(new AirConnection("Cracow", "Warsaw"));
        airConnectionsList.add(new AirConnection("London", "Zurich"));
        airConnectionsList.add(new AirConnection("Zurich", "Paris"));
        airConnectionsList.add(new AirConnection("Paris", "Cracow"));
        airConnectionsList.add(new AirConnection("Cracow", "Zurich"));
        airConnectionsList.add(new AirConnection("Cracow","Vienna"));
        airConnectionsList.add(new AirConnection("Vienna", "Cracow"));
        airConnectionsList.add(new AirConnection("Vienna", "Zurich"));
        airConnectionsList.add(new AirConnection("London", "Vienna"));
        airConnectionsList.add(new AirConnection("Paris", "Vienna"));
        airConnectionsList.add(new AirConnection("London", "Cracow"));

        return airConnectionsList;
    }
}
