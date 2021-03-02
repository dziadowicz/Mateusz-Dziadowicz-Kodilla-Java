package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {

        String name = "Twitter";
        System.out.println(name);

        return name;
    }
}
