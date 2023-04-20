package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{

    double length;

    double width;

    @Override

    double area() {

        return length*width;   }

    @Override
    void draw(GraphicsContext gr) {
            gr.setLineWidth(5);
            gr.setFill(outcolor);
            gr.setStroke(color);
            gr.strokeRect(x, y, length, width);
            gr.fillRect(x, y, length, width);
    }

    public Rectangle(double x, double y, Color color, Color outcolor, double length, double width) {
        super(x, y, color, outcolor);
        this.length = length;
        this.width = width;
    }

    @Override

    public String toString() {

        return "Rectangle color is " + super.color +  "and area is : " + area();   }

}

