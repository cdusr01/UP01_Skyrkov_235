package ru.skyrkov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField answerField;

    @FXML
    private TextField numberField;

    @FXML
    void onResultClick(ActionEvent event) {
        int N = Integer.parseInt(numberField.getText());
        int i = 0;
        while (i * i <= N){
            i++;
        }
        answerField.setText("" + (i - 1));
    }

}
