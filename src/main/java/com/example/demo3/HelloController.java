package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {

    public Canvas Canvas1;

    public void OnStart(ActionEvent actionEvent) {
        GraphicsContext gc = Canvas1.getGraphicsContext2D();

// установка толщины линии

        gc.setLineWidth(5.0);

// установка цвета

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.RED);
// рисование скругленного прямоугольника

        gc.strokeRoundRect(10, 10, 50, 50, 10, 10);

        gc.fillRoundRect(10, 10, 50, 50, 10, 10);
    }
}