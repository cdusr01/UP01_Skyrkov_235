package ru.skyrkov.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class NewController {

    @FXML
    private TextField inputX;

    @FXML
    private TextField inputY;

    @FXML
    private Label resultText;

    @FXML
    void onResultClick(ActionEvent event) {
        int x = Integer.parseInt(inputX.getText());
        int y = Integer.parseInt(inputY.getText());
        if (y >= 0 && y <= 12) {
            if (y > abs(x)) {
                resultText.setText("Да");
            } else if (y < abs(x)) {
                resultText.setText("Нет");
            } else {
                resultText.setText("На границе");
            }
        }else {resultText.setText("Нет");}
    }

}
