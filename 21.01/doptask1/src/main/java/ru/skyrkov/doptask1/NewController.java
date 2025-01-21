package ru.skyrkov.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private TextField count;

    @FXML
    private TextField mod;

    @FXML
    void onResultClick(ActionEvent event) {
        int A = Integer.parseInt(aTextField.getText());
        int B = Integer.parseInt(bTextField.getText());
        int C = Integer.parseInt(cTextField.getText());
        count.setText("" + (A*B / (C * 4)));
        mod.setText("" + (A*B % (C * 4)));
    }

}
