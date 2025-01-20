package ru.skyrkov.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField a1field;

    @FXML
    private TextField a2field;

    @FXML
    private TextField b1field;

    @FXML
    private TextField b2field;

    @FXML
    private TextField c1field;

    @FXML
    private TextField c2field;

    @FXML
    private Button resultBtn;

    @FXML
    private TextField resultX;

    @FXML
    private TextField resultY;

    @FXML
    void onClickResultBtn(ActionEvent event) {
        double a1 = Double.parseDouble(a1field.getText());
        double a2 = Double.parseDouble(a2field.getText());
        double b1 = Double.parseDouble(b1field.getText());
        double b2 = Double.parseDouble(b2field.getText());
        double c1 = Double.parseDouble(c1field.getText());
        double c2 = Double.parseDouble(c2field.getText());
        double d = a1 * b2 - a2 * b1;
        double x = (c1 * b2 - c2 * b1) / d;
        double y = (a1 * c2 - a2 * c1) / d;
        if (d != 0) {
            resultX.setText("" + x);
            resultY.setText("" + y);
        }
        else {
            resultX.setText("Нет решения!");
            resultY.setText("Нет решения!");
        }
    }

}
