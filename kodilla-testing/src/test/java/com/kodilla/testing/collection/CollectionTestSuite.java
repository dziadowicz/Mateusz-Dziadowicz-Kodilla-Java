package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When the numbers list is empty result list should be empty also")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.clear();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        numbers = oddNumbersExterminator.exterminate(numbers);
        List<Integer> emptyList = new ArrayList<>();
        emptyList.clear();
        //Then
        Assertions.assertEquals(emptyList, numbers);
    }

    @DisplayName("When created numbers list result list should have all and only even numbers from that list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        numbers = oddNumbersExterminator.exterminate(numbers);
        List<Integer> expectedList = Arrays.asList(2, 4, 6, 8, 10);
        //Then
        Assertions.assertEquals(expectedList, numbers);
    }

}
