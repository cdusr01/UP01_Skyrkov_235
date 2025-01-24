package ru.skyrkov.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField AInput;

    @FXML
    private TextField BInput;

    @FXML
    private Label RezultLabel;

    @FXML
    private Button cBTN;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        int count = 0;
        int a = Integer.parseInt(AInput.getText());
        int b = Integer.parseInt(BInput.getText());
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        if (count > 0) {
            RezultLabel.setText("" + count);
        }
        else {
            RezultLabel.setText("Нет четных чисел на этом отрезке");
        }
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

}
