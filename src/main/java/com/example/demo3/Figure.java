package com.example.demo3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Figure extends Shape{

    double length;

    public Figure(double x, double y, Color color, Color outcolor, double length) {
        super(x, y, color, outcolor);
        this.length = length;
    }

    @Override

    double area() {

        return length*6;   }

    @Override
    void draw(GraphicsContext gr) {
        gr.setLineWidth(5);
        gr.setFill(outcolor);
        gr.setStroke(color);
        gr.strokeRect(x, y, length, length);
        gr.fillRect(x, y, length, length);
    }

    @Override

    public String toString() {

        return "Figure color is " + super.color +  "and area is : " + area();   }

}

