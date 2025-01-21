package ru.skyrkov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField inputField;

    @FXML
    private TextField numberField;

    @FXML
    private TextField posField;

    @FXML
    void onClickResult(ActionEvent event) {
        int defnum = Integer.parseInt(inputField.getText());
        int nump2 = defnum / 10 % 10;
        int nump3 = defnum % 10;
        if (nump3 > nump2){
            posField.setText("3");
            numberField.setText("" + nump3);
        }
        else {
            posField.setText("2");
            numberField.setText("" + nump2);
        }
    }

}
