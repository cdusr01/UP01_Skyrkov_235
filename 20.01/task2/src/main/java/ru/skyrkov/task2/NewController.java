package ru.skyrkov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Math.*;

public class NewController {

    @FXML
    private TextField inputX;

    @FXML
    private Button resultBtn;

    @FXML
    private TextField resultY;

    @FXML
    void onClickResult(ActionEvent event) {
        double x = Double.parseDouble(inputX.getText());
        double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
        resultY.setText("" + y);
    }

}
