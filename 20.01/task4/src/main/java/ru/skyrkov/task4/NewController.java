package ru.skyrkov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class NewController {

    @FXML
    private TextField inputA;

    @FXML
    private Button resultBtn;

    @FXML
    private TextField resultY;

    @FXML
    void onResultClick(ActionEvent event) {
        double A = Double.parseDouble(inputA.getText());
        double x = A / 12f;
        double b = exp(-A * x);
        double y = 1 - exp(-A * x) * sin(A * x + b);
        resultY.setText(""+y);
    }

}
