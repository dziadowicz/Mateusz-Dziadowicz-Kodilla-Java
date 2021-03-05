package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("With sesame") || bun.equals("Without sesame")) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun options: \"With sesame\" or \"Without sesame\".");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Available sauces: standard, 1000 islands, barbecue");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {

            if (burgers < 0 || burgers > 4) throw new IllegalStateException("Invalid burgers number");
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
