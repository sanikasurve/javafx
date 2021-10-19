package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField answer, number1, number2;

    @FXML
    protected void onAddButtonClick() {
        answer.setText("You clicked Add!");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first + second;
        answer.setText(String.valueOf(result));
    }

    @FXML
    protected void onSubButtonClick() {
        answer.setText("You clicked Sub!");
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first - second;
        answer.setText(String.valueOf(result));
    }
}