package com.example.demo3;

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

abstract class Shape {
    //параметры фигуры - приватные поля

    Color color;
    // объявление абстрактных методов

    abstract double area();

    //abstract void draw(GraphicContext gr);

    // конструктор

    public Shape(Color color) {

        System.out.println("Shape constructor called");

        this.color = color;     }



    // реализация методов

    public void setColor(Color color) {

        this.color=color;     }
}
