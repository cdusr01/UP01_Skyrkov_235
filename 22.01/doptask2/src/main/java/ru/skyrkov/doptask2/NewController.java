package ru.skyrkov.doptask2;

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

        if (num % 2 == 0) result += "четное ";
        else result += "нечетное ";
        if (num >= 1 && num <= 9) result += "однозначное ";
        else if (num >= 10 && num <= 99) result += "двузначное ";
        else if (num >= 100 && num <= 999) result += "трехзначное ";

        resultLabel.setText(result + "число");
    }
}
