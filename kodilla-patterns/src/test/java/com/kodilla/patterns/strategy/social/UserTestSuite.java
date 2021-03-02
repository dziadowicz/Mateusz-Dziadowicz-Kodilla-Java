package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

    //Given
        User john = new Millenials("John The Millenial");
        User rob = new YGeneration("Rob Y");
        User alice = new ZGeneration("Alice InChanes");

        //When
        String johnsSocial = john.socialPublisher.share();
        System.out.println("Johns social: " + johnsSocial);
        String robsSocial = rob.socialPublisher.share();
        System.out.println("Rob social: " + robsSocial);
        String alicesSocial = alice.socialPublisher.share();
        System.out.println("Alice social: " + alicesSocial);

        //Then
        assertEquals("Facebook", johnsSocial);
        assertEquals("Twitter", robsSocial);
        assertEquals("Snapchat", alicesSocial);

    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User john = new Millenials("John The Millenial");

        //When
        String johnsSocial = john.socialPublisher.share();
        System.out.println("Johns social: " + johnsSocial);
        john.setSocialPublisher(new SnapchatPublisher());
        johnsSocial = john.socialPublisher.share();
        System.out.println("Johns new social: " + johnsSocial);

        //Then
        assertEquals("Snapchat", johnsSocial);
    }
}
