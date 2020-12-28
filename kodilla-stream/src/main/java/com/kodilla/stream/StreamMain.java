package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Making poem more beautiful");
        poemBeautifier.beautify("Three Rings for the Elven-kings under the sky,", poem -> "ABC " + poem + " ABC");
        poemBeautifier.beautify("Seven for the Dwarf-lords in their halls of stone,", poem -> poem.toUpperCase());
        poemBeautifier.beautify("Nine for Mortal Men doomed to die,", poem -> poem.replace("o", "0"));
        poemBeautifier.beautify("One for the Dark Lord on his dark throne", poem -> poem.replace("Dark Lord", "Sauron"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
