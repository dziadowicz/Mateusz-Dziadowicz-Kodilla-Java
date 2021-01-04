package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    void exceptionsTest() {

        // given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        // when & then
        assertAll(
                () -> assertThrows(HandledException.class, () -> exceptionHandling.handleException(2, 5)),
                () -> assertThrows(HandledException.class, () -> exceptionHandling.handleException(0.9, 5)),
                () -> assertThrows(HandledException.class, () -> exceptionHandling.handleException(1.5, 1.5)),
                () -> assertDoesNotThrow(() -> exceptionHandling.handleException(1, 5))
        );
    }
}
