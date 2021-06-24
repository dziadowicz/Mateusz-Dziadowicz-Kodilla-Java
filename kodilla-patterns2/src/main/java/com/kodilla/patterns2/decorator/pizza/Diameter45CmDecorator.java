package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class Diameter45CmDecorator extends AbstractPizzaOrderDecorator{

    public Diameter45CmDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.00));
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " 45cm diameter";
    }
}