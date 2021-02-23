package com.kodilla.good.patterns.challenges;

public class MailInformation implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("E-mail to user " + user.getFirstName() + " " + user.getLastName() + "has been sent.");
    }
}
