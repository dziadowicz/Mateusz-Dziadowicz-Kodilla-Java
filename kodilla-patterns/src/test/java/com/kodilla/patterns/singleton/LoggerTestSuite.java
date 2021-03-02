package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("Hello");
        //When
        String lastLog = logger.getLastLog();
        System.out.println(lastLog);
        //Then
        assertEquals("Hello", lastLog);
    }
}
