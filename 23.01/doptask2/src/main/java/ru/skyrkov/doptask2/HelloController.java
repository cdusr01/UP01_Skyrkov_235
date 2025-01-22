package ru.skyrkov.doptask2;

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
        String[] tens = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
        String[] hundreds = { "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот" };
        result += hundreds[N / 100] + " " + tens[N / 10 % 10] + " " + units[N % 10];
        resField.setText(result);
    }

}
