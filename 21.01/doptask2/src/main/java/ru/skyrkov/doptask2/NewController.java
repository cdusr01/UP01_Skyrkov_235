package ru.skyrkov.doptask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField centuryField;

    @FXML
    private Button onClickResult;

    @FXML
    private TextField yearField;

    @FXML
    void onClickResult(ActionEvent event) {
        int year = Integer.parseInt(yearField.getText());
        if (year % 100 == 0)
            centuryField.setText("" + (year / 100));
        else
            centuryField.setText("" + (year / 100 + 1));
    }

}
