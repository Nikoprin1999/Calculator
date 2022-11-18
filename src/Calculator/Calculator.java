package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    CalculatorEngine calcEngine = new CalculatorEngine(this);
    JPanel windowContent = new JPanel(new BorderLayout());
    JTextField textField = new JTextField(30);
    JPanel buttonsPanel = new JPanel(new GridLayout(4, 4));
    JPanel mathSignsPanel = new JPanel(new GridLayout(4, 2));
    JButton[] buttons = new JButton[12];
    JButton[] mathSigns = new JButton[8];

    Calculator() {
        windowContent.add("North", textField);
        windowContent.add("East", mathSignsPanel);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        for (int i = 0; i < mathSigns.length; i++) {
            mathSigns[i] = new JButton();
            mathSigns[i].addActionListener(calcEngine);
            mathSignsPanel.add(mathSigns[i]);
            mathSigns[i].setBackground(Color.WHITE);
        }
        ;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(Integer.toString(i));
            buttons[i].addActionListener(calcEngine);
            buttons[i].setBackground(Color.WHITE);
            buttonsPanel.add(buttons[i]);
        }
        ;
        buttons[10].setText(".");
        buttons[11].setText("=");
        mathSigns[0].setText("+");
        mathSigns[1].setText("-");
        mathSigns[2].setText("*");
        mathSigns[3].setText("/");
        mathSigns[4].setText("→\t");
        mathSigns[5].setText("√\t");
        mathSigns[6].setText("C");
        mathSigns[7].setText("x²");
        windowContent.add("Center", buttonsPanel);
        setContentPane(windowContent);
        setVisible(true);
        pack();
    }

    ;

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
    }

    ;
};