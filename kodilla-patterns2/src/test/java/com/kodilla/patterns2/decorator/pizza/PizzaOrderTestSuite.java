package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        List<String> ingredients = theOrder.getIngredients();
        // Then
        assertEquals("[Sauce, Cheese]", ingredients.toString());
    }

    @Test
    public void testBasicPizzaOrderGetDestiption() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Your order: pizza", description);
    }

    @Test
    public void testPizza45CmWithPepperoniWithDeliveryGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Diameter45CmDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(30), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithMushroomsAndPepperoniGetIngredients() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        // When
        List<String> ingredients = theOrder.getIngredients();
        // Then
        assertEquals("[Sauce, Cheese, Mushrooms, Pepperoni]", ingredients.toString());
    }

    @Test
    public void testPizzaOrder60CmWithDeliveryGetDestiption() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Diameter60CmDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Your order: pizza 60cm diameter with delivery", description);
    }
}
