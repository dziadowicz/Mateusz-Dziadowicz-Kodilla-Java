package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map <String, Boolean> airportAvailability = new HashMap<>();
        String airport1 = "Warsaw";
        Boolean airportIsAvailable = true;
        airportAvailability.put(airport1, airportIsAvailable);
        String airport2 = "Madrid";
        Boolean airportIsNotAvailable = false;
        airportAvailability.put(airport2, airportIsNotAvailable);
        String airport3 = "London";
        airportAvailability.put(airport3, airportIsNotAvailable);
        String airport4 = "Berlin";
        airportAvailability.put(airport4, airportIsAvailable);
        String airport5 = "Zurich";
        airportAvailability.put(airport5, airportIsAvailable);

        if (airportAvailability.containsKey(flight.getArrivalAirport()))  {
            for (Map.Entry<String, Boolean> entry :airportAvailability.entrySet()) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    if (entry.getValue().equals(true)) {
                        System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is possible");
                    } else {
                        System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is impossible");
                    }
                }
            }
        } else {
            throw new RouteNotFoundException();
        }
    }
}
