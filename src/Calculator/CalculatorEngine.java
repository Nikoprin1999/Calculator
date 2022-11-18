package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    Calculator parent;

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    ;
    double currentValue = 0;
    char selectedSign = ' ';
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String dspTextField = parent.textField.getText();
        double displayValue = 0;
        if (!"".equals(dspTextField)) {
            displayValue = Double.parseDouble(dspTextField);
        }
        ;
        Object src = e.getSource();
        if (src == parent.mathSigns[0]) {
            selectedSign = '+';
            currentValue = displayValue;
            parent.textField.setText("");
        } else if (src == parent.mathSigns[1]) {
            selectedSign = '-';
            currentValue = displayValue;
            parent.textField.setText("");
        } else if (src == parent.mathSigns[2]) {
            selectedSign = '*';
            currentValue = displayValue;
            parent.textField.setText("");
        } else if (src == parent.mathSigns[3]) {
            selectedSign = '/';
            currentValue = displayValue;
            parent.textField.setText("");
        } else if (src == parent.mathSigns[4]) {
            parent.textField.setText(""+parent.textField.getText().substring(0,
                    parent.textField.getText().length() - 1));
        } else if (src == parent.mathSigns[5]) {
            currentValue = Math.sqrt(displayValue);
            parent.textField.setText(String.valueOf(currentValue));
        } else if (src == parent.mathSigns[6]) {
            parent.textField.setText("");
            currentValue = 0;
        } else if (src == parent.mathSigns[7]) {
            currentValue = displayValue * displayValue;
            parent.textField.setText(String.valueOf(currentValue));
        } else if (src == parent.buttons[11]) {
            if (selectedSign == '+') {
                currentValue += displayValue;
                parent.textField.setText("" + currentValue);
            } else if (selectedSign == '-') {
                currentValue -= displayValue;
                parent.textField.setText("" + currentValue);
            } else if (selectedSign == '*') {
                currentValue *= displayValue;
                parent.textField.setText("" + currentValue);
            } else if (selectedSign == '/') {
                currentValue /= displayValue;
                parent.textField.setText("" + currentValue);
            }
            ;
        } else {
            String clickedButtonLabel = clickedButton.getText();
            parent.textField.setText(parent.textField.getText() + clickedButtonLabel);
        };
    };
    ;
};