package ru.skyrkov.doptask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class HelloController {

    @FXML
    private Button BTN;

    @FXML
    private TextField ETextField;

    @FXML
    private Label resultLabel;


    @FXML
    void BTNonAction(ActionEvent event) {
        int E = Integer.parseInt(ETextField.getText());
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 1; i <= E; i++) {
            a = a + 1.0 / pow(i, 8);
            b = b + 1.0 / (i * (i + 1));
            d = d + pow(-1, i + 1) / (i * (i + 1) * (i + 2));
        }
        for (int i = 0; i <= E; i++) {
            int t = 1;
            for (int j = 1; j <= i; j++) {
                t = t * j;
            }
            c = c + pow(-1, i) / t;
            e = e + pow(-2, i) / t;
            f = f + (1 / (pow(4, i) + pow(5, i)));
        }
        resultLabel.setText("a - " + a + "\tб - " + b + "\nв - " + c + "\tг - " + d + "\nд - " + e + "\te - " + f);
    }

}
