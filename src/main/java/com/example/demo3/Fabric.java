package com.example.demo3;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class Fabric {
    public Shape createShape(String name){
        HashMap <Integer,Shape> collect = new HashMap<>();
        int object = Integer.parseInt(name);
        collect.put(new Integer(1),new Circle(10,10, Color.BLACK,Color.BLUE,20));
        collect.put(new Integer(2),new Rectangle(20,20,Color.RED,Color.VIOLET,20,20));
        collect.put(new Integer(3),new Figure(10,10,Color.BLACK,Color.WHITE,10));

        if (name.equals(new String("Circle"))){
            return new Circle(10,10, Color.BLACK,Color.BLUE,20);
        } else if (name.equals(new String("Rectangle"))) {
            return new Rectangle(20,20,Color.RED,Color.VIOLET,20,20);
        } else {
            return new Figure(10,10,Color.BLACK,Color.WHITE,10);
        }
        //return collect.get(object);
    }
}
