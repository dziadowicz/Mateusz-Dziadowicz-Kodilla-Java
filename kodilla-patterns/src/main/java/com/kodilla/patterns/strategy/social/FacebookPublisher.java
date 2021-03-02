package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share(){

        String name = "Facebook";
        System.out.println(name);

        return name;
    }
}
