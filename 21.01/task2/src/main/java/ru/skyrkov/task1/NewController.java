package ru.skyrkov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField inputField;

    @FXML
    private TextField resultField;

    @FXML
    void OnResultClick(ActionEvent event) {
        String data = inputField.getText();
        String result = "";
        char[] symbols= data.toCharArray();
        resultField.setText("" + symbols[1] + symbols[0] + symbols[2]);
    }

}
