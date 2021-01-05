package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Warsaw", "Honolulu");

        try {
            if (flightFinder.findFilght(flight1)) {
                System.out.println("Flight from " + flight1.getDepartureAirport() + " to " + flight1.getArrivalAirport() + " is possible");
            } else {
                System.out.println("Flight from " + flight1.getDepartureAirport() + " to " + flight1.getArrivalAirport() + " is impossible");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Airport " + flight1.getArrivalAirport() + " do not exist in database (" + e + ")");
        } finally {
            System.out.println("Thank you and goodbye!");
        }

        Flight flight2 = new Flight("Warsaw", "Madrid");

        try {
            if (flightFinder.findFilght(flight2)) {
                System.out.println("Flight from " + flight2.getDepartureAirport() + " to " + flight2.getArrivalAirport() + " is possible");
            } else {
                System.out.println("Flight from " + flight2.getDepartureAirport() + " to " + flight2.getArrivalAirport() + " is impossible");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Airport " + flight2.getArrivalAirport() + " do not exist in database (" + e + ")");
        } finally {
            System.out.println("Thank you and goodbye!");
        }

    }
}
