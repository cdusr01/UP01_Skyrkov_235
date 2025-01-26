package ru.skyrkov.task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.Math.*;

import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    private Scene scene5;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = creatScene1();
        scene2 = creatScene2();
        scene3 = creatScene3();
        scene4 = creatScene4();
        scene5 = creatScene5();
        primaryStage.setTitle("Практическая номер 6");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene creatScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Найти периметр");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                double c = sqrt(pow(a, 2) + pow(b, 2));
                double P = a + b + c;
                resultLabel.setText("периметр квадрата: " + P);
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene creatScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        Button calcButton = new Button("Вычислить расстояние");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double x = Double.parseDouble(sideAField.getText());
                double y = 3 * pow(x, 6) - 6 * pow(x, 2) - 7;
                resultLabel.setText("расстояние между точками" + y);
            } catch (ArithmeticException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    public static void main(String[] args) {
        launch();
    }

    private Scene creatScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        Button calcButton = new Button("Найти общий путь");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                String res = "";
                double A = Double.parseDouble(sideAField.getText());
                double A2 = A * A;
                double A4 = A2 * A2;
                double A8 = A4 * A4;
                res += A2 + ", " + A4 + ", " + A8;
                resultLabel.setText(res);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene creatScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        Button calcButton = new Button("Найти периметр");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double A = Double.parseDouble(sideAField.getText());
                double x = A / 12f;
                double b = exp(-A * x);
                double y = 1 - exp(-A * x) * sin(A * x + b);
                resultLabel.setText("" + y);
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
    private Scene creatScene5() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideCField = new TextField();
        TextField sideA1Field = new TextField();
        TextField sideB1Field = new TextField();
        TextField sideC1Field = new TextField();
        Button calcButton = new Button("Найти периметр");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double a1 = Double.parseDouble(sideAField.getText());
                double a2 = Double.parseDouble(sideBField.getText());
                double b1 = Double.parseDouble(sideCField.getText());
                double b2 = Double.parseDouble(sideA1Field.getText());
                double c1 = Double.parseDouble(sideB1Field.getText());
                double c2 = Double.parseDouble(sideC1Field.getText());
                double d = a1 * b2 - a2 * b1;
                double x = (c1 * b2 - c2 * b1) / d;
                double y = (a1 * c2 - a2 * c1) / d;
                if (d != 0) {
                    resultLabel.setText("" + x);
                    resultLabel.setText("" + y);
                }
                else {
                    resultLabel.setText("Нет решения!");
                    resultLabel.setText("Нет решения!");
                }
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, sideBField, sideCField, sideA1Field, sideB1Field, sideC1Field);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
}