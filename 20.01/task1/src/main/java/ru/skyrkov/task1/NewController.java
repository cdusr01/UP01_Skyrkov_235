package ru.skyrkov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.lang.Math.*;
import java.util.NavigableMap;

public class NewController {

    @FXML
    private TextField inputa;

    @FXML
    private TextField inputb;

    @FXML
    private Button resultBtn;

    @FXML
    private Label resultP;

    @FXML
    private Label resultc;

    @FXML
    void onClickResult(ActionEvent event) {
        double a = Double.parseDouble(inputa.getText());
        double b = Double.parseDouble(inputb.getText());
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        String result1 = String.format("%.3f", c);
        String result2 = String.format("%.3f", (a + b + c));
        resultc.setText("c = " + result1);
        resultP.setText("P = " + result2);
    }

}
