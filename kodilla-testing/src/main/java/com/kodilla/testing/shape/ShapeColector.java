package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeColector {

    private List<Shape> figureList = new ArrayList<>();

    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            return true;
        }
        return false;
    }

    public int getNumberOfFigures() {
        return figureList.size();
    }

    public Shape getFigure(int n) {
        return figureList.get(n);
    }

    public String showFigures() {
        String result = "";
        if (figureList.size() > 0) {
            for (Shape figure : figureList) {
                result += figure.getShapeName() + ", ";
            }
            result = result.substring(0, result.length() - 2);
        }
        return result;
    }
}
