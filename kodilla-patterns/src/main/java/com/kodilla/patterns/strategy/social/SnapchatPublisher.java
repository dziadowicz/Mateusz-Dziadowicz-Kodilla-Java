package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {

        String name = "Snapchat";
        System.out.println(name);

        return name;
    }
}
