package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Warsaw", "Honolulu");

        try {
            flightFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport " + flight1.getArrivalAirport() + " do not exist in database (" + e + ")");
        } finally {
            System.out.println("Thank you and goodbye!");
        }

        Flight flight2 = new Flight("Warsaw", "Madrid");

        try {
            flightFinder.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport " + flight2.getArrivalAirport() + " do not exist in database (" + e + ")");
        } finally {
            System.out.println("Thank you and goodbye!");
        }

    }
}
