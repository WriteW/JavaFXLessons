package com;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Gfx2DExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        //窗口大小为600*600
        Button button = new Button("按钮");
        //设置按钮的位置
        button.setLayoutX(300);
        button.setLayoutY(300);
        //设置按钮的大小
        button.setScaleX(1);
        button.setScaleY(1);

        Circle circle = new Circle();
        //设置圆心的位置
        circle.setCenterX(500);
        circle.setCenterY(200);
        //圆的半径
        circle.setRadius(125);//125
        //圆的边框颜色
        circle.setStroke(Color.RED);
        //边框粗细程度
        circle.setStrokeWidth(5);
        //圆里面的颜色
        circle.setFill(Color.GREEN);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(200);
        rectangle.setWidth(300);
        rectangle.setHeight(400);
        //边框颜色
        rectangle.setStroke(Color.TRANSPARENT);
        //正方行里的颜色
        rectangle.setFill(Color.valueOf("#00ffff"));
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 600, 600, true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Example");
        primaryStage.show();
    }
}

