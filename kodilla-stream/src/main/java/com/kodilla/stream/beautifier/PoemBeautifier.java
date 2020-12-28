package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String poem, PoemDecorator poemDecorator) {
        String betterPoem = poemDecorator.decorate(poem);
        System.out.println(betterPoem);
    }
}
