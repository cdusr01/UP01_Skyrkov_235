package ru.skyrkov.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField monthField;

    @FXML
    private TextField perField;

    @FXML
    private TextField sumField;

    @FXML
    void onResultClick(ActionEvent event) {
        double P = Double.parseDouble(perField.getText());
        double sum = 1000;
        int month = 0;
        while (sum <= 1100) {
            sum += (P / 100) * sum;
            month += 1;
        }
        monthField.setText("" + month);
        sumField.setText("" + sum);
    }

}
