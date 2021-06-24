package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class DeliveryDecorator extends AbstractPizzaOrderDecorator {

    public DeliveryDecorator(PizzaOrder pizzaOrder) {
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
        return super.getDescription() + " with delivery";
    }
}
