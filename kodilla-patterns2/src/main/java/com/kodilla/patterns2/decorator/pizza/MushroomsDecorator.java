package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class MushroomsDecorator extends AbstractPizzaOrderDecorator{

    public MushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public List<String> getIngredients() {
        List<String> list = super.getIngredients();
        list.add("Mushrooms");
        return list;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
