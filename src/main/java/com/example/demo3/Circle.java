package com.example.demo3;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape{
    double radius;

    @Override
    double area()
    {
        return radius*radius;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setLineWidth(5);
        gr.setFill(outcolor);
        gr.setStroke(color);
        gr.strokeOval(x,y,radius,radius);
        gr.fillOval(x,y, radius, radius);
    }

    public Circle(double x, double y, Color color, Color outcolor, double radius) {
        super(x, y, color, outcolor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle color is " + super.color +  "and area is : " + area();
    }
}
