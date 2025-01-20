package ru.skyrkov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField inputA;

    @FXML
    private TextField res1;

    @FXML
    private TextField res2;

    @FXML
    private TextField res3;

    @FXML
    void onResultClick(ActionEvent event) {
        double A = Double.parseDouble(inputA.getText());
        double A2 = A * A;
        double A4 = A2 * A2;
        double A8 = A4 * A4;
        res1.setText(""+A2);
        res2.setText(""+A4);
        res3.setText(""+A8);
    }

}
