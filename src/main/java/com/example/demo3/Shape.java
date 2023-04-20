package com.example.demo3;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

abstract class Shape {
    //параметры фигуры - приватные поля
    protected double x,y;
    protected Color color;
    protected Color outcolor;
    // объявление абстрактных методов

    abstract double area();

    abstract void draw(GraphicsContext gr);

    // конструктор

    public Shape(double x, double y, Color color, Color outcolor) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.outcolor = outcolor;
    }


    // реализация методов


    public void setColor(Color color) {
        this.color = color;
    }

    public void setOutcolor(Color outcolor) {
        this.outcolor = outcolor;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

