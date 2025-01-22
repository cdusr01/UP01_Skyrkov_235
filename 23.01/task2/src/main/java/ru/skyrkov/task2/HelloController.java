package ru.skyrkov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField inputNum;

    @FXML
    private TextField resultField;

    @FXML
    void onClickResult(ActionEvent event) {
        int age = Integer.parseInt(inputNum.getText());
        String[] units = {
                "", "один", "два", "три", "четыре", "пять",
                "шесть", "семь", "восемь", "девять"
        };
        String[] tens = {
                "", "", "двадцать", "тридцать",
                "сорок", "пятьдесят", "шестьдесят"
        };
        String description = tens[age / 10] + " ";

        if (age % 10 != 0) {
            description += units[age % 10] + " ";
        }
        int lastDigit = age % 10;
        if (lastDigit == 1 && age != 11) {
            description += "год";
        } else if (lastDigit >= 2 && lastDigit <= 4 && (age < 12 || age > 14)) {
            description += "года";
        } else {
            description += "лет";
        }
        resultField.setText(description.trim());
    }
}
