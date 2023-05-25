package com.hillel.dzhurynskyi.homework.hm24.decorator;

import java.awt.*;

public class ShapeBorderColorDecorator extends ShapeDecorator {

    private Color color;

    public ShapeBorderColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderColor();
    }

    protected void setBorderColor() {
        // Display message whenever function is called
        System.out.println("Border Color: " + color);
    }
}
