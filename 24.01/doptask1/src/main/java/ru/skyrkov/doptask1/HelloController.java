package ru.skyrkov.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class HelloController {

    @FXML
    private Button BTN;

    @FXML
    private TextField KTextField;

    @FXML
    private TextField NTextField;

    @FXML
    private Label RezultLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int k = Integer.parseInt(KTextField.getText());
        int n = Integer.parseInt(NTextField.getText());
        double r = 0;
        for (int i = 1; i <= n; i++) {
            r = r + pow(i, k);
        }
        RezultLable.setText(String.valueOf(r));
    }

}
