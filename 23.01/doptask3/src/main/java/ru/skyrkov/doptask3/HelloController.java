package ru.skyrkov.doptask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField AInput;

    @FXML
    private TextField BInput;

    @FXML
    private TextField resultField;

    @FXML
    void onResultClick(ActionEvent event) {
        int a = Integer.parseInt(AInput.getText());
        int b = Integer.parseInt(BInput.getText());
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        resultField.setText("" + a);
    }

}
