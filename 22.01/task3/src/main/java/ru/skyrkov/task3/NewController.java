package ru.skyrkov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class NewController {

    @FXML
    private TextField maxResult;

    @FXML
    private TextField minResult;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    void onResultClick(ActionEvent event) {
        int[] nums = {Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText())};
        maxResult.setText("" + Arrays.stream(nums).max().getAsInt());
        minResult.setText("" + Arrays.stream(nums).min().getAsInt());
    }

}
