package com.kodilla.hibernate.manytomany.facade;

public class ProcessingException extends Exception{

    public static String ERR_NOT_FOUND_IN_DATABASE = "No object found";

    public ProcessingException(String message) {
        super(message);
    }
}
