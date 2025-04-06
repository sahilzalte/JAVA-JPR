import javax.swing.*;
import java.awt.event.*;

public class DelegationModelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Delegation Event Model");

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 40);

        // Using delegation model: Button is the source, this listener handles the event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
