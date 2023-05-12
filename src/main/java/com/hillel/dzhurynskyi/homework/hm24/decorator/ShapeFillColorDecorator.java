package com.hillel.dzhurynskyi.homework.hm24.decorator;

import java.awt.*;

public class ShapeFillColorDecorator extends ShapeDecorator {

    private Color color;

    public ShapeFillColorDecorator(Shape decoratedShape, Color color) {
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
        System.out.println("Fill Color: " + color);
    }
}
