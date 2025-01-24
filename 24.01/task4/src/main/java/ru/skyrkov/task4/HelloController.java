package ru.skyrkov.task4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class HelloController {

    @FXML
    private TextField AInput;

    @FXML
    private TextField NInput;

    @FXML
    private Label RezultLabel;

    @FXML
    private Button cBTN;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        int a = Integer.parseInt(AInput.getText());
        int n = Integer.parseInt(NInput.getText());
        String res = "";
        for (int i = 1; i <= n; i++){
            res += " " + pow(a, i);
        }
        RezultLabel.setText(res);
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

}
