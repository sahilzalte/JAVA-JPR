import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutCalculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JPanel panel;
    String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
    };
    JButton[] buttons = new JButton[16];

    String num1 = "", num2 = "", operator = "";

    GridLayoutCalculator() {
        frame = new JFrame("Grid Layout Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            num1 = num2 = operator = "";
            textField.setText("");
        } else if (command.equals("=")) {
            num2 = textField.getText();
            double result = calculate(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            textField.setText("" + result);
            num1 = "" + result;
            num2 = operator = "";
        } else { 
            if (!textField.getText().isEmpty()) {
                num1 = textField.getText();
                operator = command;
                textField.setText("");
            }
        }
    }

    private double calculate(double n1, double n2, String op) {
        switch (op) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n2 != 0 ? n1 / n2 : 0; 
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new GridLayoutCalculator();
    }
}

