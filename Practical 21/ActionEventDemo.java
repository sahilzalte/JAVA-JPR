import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    public ActionEventDemo() {
        setTitle("Action Event Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        button = new JButton("Click Me");

        add(textField);
        add(button);

        button.addActionListener(this);  // Registering ActionListener

        setVisible(true);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent e) {
        textField.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
