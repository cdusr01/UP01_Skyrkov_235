package ru.skyrkov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private TextField answerField;

    @FXML
    private TextField inputDay;

    @FXML
    void onClickResult(ActionEvent event) {
        int K = Integer.parseInt(inputDay.getText());
        int D = K % 7 + 1;
        switch (D){
            case 1:
                answerField.setText("Понедельник");
                break;
            case 2:
                answerField.setText("Вторник");
                break;
            case 3:
                answerField.setText("Среда");
                break;
            case 4:
                answerField.setText("Четверг");
                break;
            case 5:
                answerField.setText("Пятница");
                break;
            case 6:
                answerField.setText("Суббота");
                break;
            case 7:
                answerField.setText("Воскресенье");
                break;
        }

    }

}
