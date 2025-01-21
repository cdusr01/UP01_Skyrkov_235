package ru.skyrkov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NumController {

    @FXML
    private TextField numberField;

    @FXML
    private TextField resultField;

    @FXML
    void onClickResult(ActionEvent event) {
        int num = Integer.parseInt(numberField.getText());
        if (num > 0){
            resultField.setText("" + (num - 8));
        }
        else if (num < 0){
            resultField.setText("" + (num + 6));
        }
        else {
            resultField.setText("10");
        }
    }

}
