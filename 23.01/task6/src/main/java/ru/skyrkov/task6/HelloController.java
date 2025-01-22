package ru.skyrkov.task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField numberField;

    @FXML
    private TextField resultField;

    @FXML
    void onResultClick(ActionEvent event) {
        int N = Integer.parseInt(numberField.getText());
        boolean tf = false;

        while (N > 0) {
            if (N % 10 == 7) {
                tf = true;
                break;
            }
            N = N / 10;
        }
        resultField.setText("" + tf);
    }

}
