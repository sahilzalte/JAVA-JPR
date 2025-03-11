
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxExample implements ActionListener {
    JFrame frame;
    JComboBox<String> comboBox;
    JLabel label;

    // Constructor
    JComboBoxExample() {
        frame = new JFrame("JComboBox Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Creating JComboBox with options
        String[] options = {"Java", "Python", "C++", "JavaScript", "Go"};
        comboBox = new JComboBox<>(options);
        comboBox.setFont(new Font("Arial", Font.BOLD, 16));
        comboBox.addActionListener(this);

        // Label to display selection
        label = new JLabel("Selected: None");
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Adding components to frame
        frame.add(comboBox);
        frame.add(label);

        frame.setVisible(true);
    }

    // Handling JComboBox selection
    public void actionPerformed(ActionEvent e) {
        String selectedItem = (String) comboBox.getSelectedItem();
        label.setText("Selected: " + selectedItem);
    }

    // Main Method
    public static void main(String[] args) {
        new JComboBoxExample();
    }
}
