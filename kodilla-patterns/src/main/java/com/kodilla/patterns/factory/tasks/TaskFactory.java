package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case DRIVING:
                return new DrivingTask("New drive", "London", "car");
            case PAINTING:
                return new PaintingTask("Wall painting", "red","wall" );
            case SHOPPING:
                return new ShoppingTask("Tomorrow's lunch", "onions", 5);
            default:
                return null;
        }

    }
}
