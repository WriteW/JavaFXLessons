package com;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class EffectsExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        Line line = new Line(200,100,300,400);

        Rectangle rectangle = new Rectangle(100,100,50,50);
        rectangle.setStroke(Color.RED);
        rectangle.setFill(Color.RED);
        rectangle.setEffect(new DropShadow(1,20,30,Color.BLACK));

        Circle circle = new Circle(50, 150, 50, Color.RED);
        //设置阴影
        circle.setEffect(
                new DropShadow(1, 20, 30, Color.web("#333333"))
        );
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(line);
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
