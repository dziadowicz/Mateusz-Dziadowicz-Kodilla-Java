package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class Diameter60CmDecorator extends AbstractPizzaOrderDecorator{

    public Diameter60CmDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(17.00));
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " 60cm diameter";
    }
}