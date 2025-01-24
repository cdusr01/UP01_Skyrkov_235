package ru.skyrkov.task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class HelloController {

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
        int i = Integer.parseInt(NInput.getText());
        double res = 1;
        double a0 = 1;
        double a1 = 1;
        for (int b = 3; b <= i; b++){
            System.out.println(b);
            double a = a0 + (a1 / pow(2, i - 1));
            res *= a;
            a0 = a1;
            a1 = a;
        }
        RezultLabel.setText("" + res);
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

}
