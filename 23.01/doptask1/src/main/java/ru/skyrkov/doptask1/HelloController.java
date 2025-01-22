package ru.skyrkov.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField numField;

    @FXML
    private TextField resField;

    @FXML
    void onResultClick(ActionEvent event) {
        int N = Integer.parseInt(numField.getText());
        String result = "";
        String[] units = { "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять" };
        String[] tens = { "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
        String[] tens1 = { "", "", "двадцать", "тридцать", "сорок" };
        if (N >= 10 && N <= 19){
            result += tens[N % 10];
        }
        else {
            result += tens1[N / 10];
            result += " " + units[N % 10];
        }
        if (N % 10 == 1 && N != 11){
            result += " учебное задание";
        } else {
            result += " учебных заданий";
        }
        resField.setText(result);
    }

}
