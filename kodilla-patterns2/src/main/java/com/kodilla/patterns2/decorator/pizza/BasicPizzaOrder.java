package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Sauce");
        ingredients.add("Cheese");
        return ingredients;
    }

    @Override
    public String getDescription() {
        return "Your order: pizza";
    }
}
