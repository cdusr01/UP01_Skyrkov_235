package ru.skyrkov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class HelloController {

    @FXML
    private TextField inputDay;

    @FXML
    private TextField inputMonth;

    @FXML
    private TextField resultField;

    @FXML
    void onClickResult(ActionEvent event) {
        int DD = Integer.parseInt(inputDay.getText());
        int MM = Integer.parseInt(inputMonth.getText());
        LocalDate date = LocalDate.of(2025, MM, DD);

        LocalDate previousDate = date.minusDays(1);

        int previousDD = previousDate.getDayOfMonth();
        int previousMM = previousDate.getMonthValue();

        resultField.setText("День: " + previousDD + ", Месяц: " + previousMM);
    }

}
