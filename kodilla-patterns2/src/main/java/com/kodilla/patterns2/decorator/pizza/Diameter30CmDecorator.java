package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class Diameter30CmDecorator extends AbstractPizzaOrderDecorator{

    public Diameter30CmDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost();
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " 30cm diameter";
    }
}
