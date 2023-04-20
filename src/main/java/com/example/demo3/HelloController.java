package com.example.demo3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Canvas Canvas1;
    public ColorPicker Picker1;

    public ColorPicker Picker2;
    public TextField fabric1;

    public ImageCollection imgs = new ImageCollection("Pic");
    public Iterator iter_main = imgs.getIterator();
    public ImageView Image1;
    public Timeline timeline = new Timeline();

    public void handle(ActionEvent t) {
        if (iter_main.hasNext()) {
            Image name = (Image) iter_main.next();
            Image1.setImage(name);
        }
    }
    public void onNext(ActionEvent actionEvent) {
        timeline.stop();
        if (iter_main.hasNext()) {
            Image name = (Image) iter_main.next();
            Image1.setImage(name);
        }
    }
    public void SetX(ActionEvent actionEvent) {
        Fabric fabricCreate = new Fabric();
        Shape shape1 = fabricCreate.createShape(fabric1.getText());
        shape1.setColor(Picker1.getValue());
        shape1.setOutcolor(Picker2.getValue());
        shape1.draw(Canvas1.getGraphicsContext2D());
        System.out.println(shape1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(iter_main.hasNext()){
                    Image name = (Image)iter_main.next();
                    Image1.setImage(name);

                }
            }
        }));
    }

    public void ImagePlay(ActionEvent actionEvent) {
    }

    public void ImageStop(ActionEvent actionEvent) {
    }
}
