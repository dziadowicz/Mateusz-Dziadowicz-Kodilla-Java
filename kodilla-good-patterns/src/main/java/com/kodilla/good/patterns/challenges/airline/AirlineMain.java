package com.kodilla.good.patterns.challenges.airline;

public class AirlineMain {

    public static void main(String[] args) {

        AirlineService airlineService = new AirlineService();
        System.out.println(airlineService.getAllFrom("Cracow"));
        System.out.println(airlineService.getAllTo("Vienna"));
        System.out.println(airlineService.getAllBy("Warsaw"));
    }

}
