package ru.skyrkov.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private Label RezultLabel;

    @FXML
    private ListView<Integer> SetListView;

    @FXML
    private Button cBTN;

    @FXML

    private Button dBTN;

    @FXML
    private TextField nTextField;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        List<Integer> data = SetListView.getItems();
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m % 10 == 2 && m % 7 == 0) {
                sum += m;
            }
        }
        if (sum > 0)
            RezultLabel.setText(String.valueOf(sum));
        else RezultLabel.setText("Чисел нет");
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void donAction(ActionEvent event) {
        if (nTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(nTextField.getText());
            SetListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            nTextField.setText("");
        }
    }

}
