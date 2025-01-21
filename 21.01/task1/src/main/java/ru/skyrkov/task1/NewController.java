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
        for (int i = symbols.length - 1; i >= 0; i--){
            result += symbols[i];
        }
        resultField.setText(result);
    }

}
