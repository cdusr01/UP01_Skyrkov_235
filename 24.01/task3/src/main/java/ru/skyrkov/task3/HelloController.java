package ru.skyrkov.task3;

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
    private Label RezultLabel;

    @FXML
    private Button cBTN;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        int n = Integer.parseInt(AInput.getText());
        double sum = 1.1;
        for (int i = 1; i <= n; i++){
            sum += pow(-1, i-1) * 0.1 * i;
        }
        RezultLabel.setText(String.format("%.2f", sum));
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

}
