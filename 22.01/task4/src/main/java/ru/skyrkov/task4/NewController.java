package ru.skyrkov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class NewController {

    @FXML
    private TextField inputA;

    @FXML
    private TextField inputB;

    @FXML
    private TextField inputC;

    @FXML
    private TextField resultField;

    @FXML
    void onResultClick(ActionEvent event) {
        int a = Integer.parseInt(inputA.getText());
        int b = Integer.parseInt(inputB.getText());
        int c = Integer.parseInt(inputC.getText());
        double M = a + pow(b, 2) / (c * 1.0f);
        int k = (int) (M % 3);
        double y = 0;
        switch (k)
        {
            case 0:
                y = exp(M+c);
                break;
            case 1:
                y = log((double) a/b);
                break;
            case 2:
                y = sqrt(abs(pow(a + b, 2) + c));
                break;
        }
        resultField.setText("" + y);
    }

}
