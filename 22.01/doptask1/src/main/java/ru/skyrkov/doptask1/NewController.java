package ru.skyrkov.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField inputX;

    @FXML
    private Label resultLabel;

    @FXML
    void onResultClick(ActionEvent event) {
        int num = Integer.parseInt(inputX.getText());
        String result = "";
        if (num == 0) result += "нулевое";
        else {
            if (num > 0) result += "положительное ";
            else result += "отрицательное ";
            if (num % 2 == 0) result += "четное ";
            else result += "нечетное ";
        }
        resultLabel.setText(result + "число");
    }
}
