import javax.swing.*;
import java.awt.event.*;

public class ItemEventExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("ItemEvent");

        JTextField tf = new JTextField();
        tf.setBounds(50, 30, 200, 20);

        JCheckBox cb = new JCheckBox("Select Me");
        cb.setBounds(50, 60, 120, 30);

        cb.addItemListener(e -> {
            tf.setText("Checkbox: " + (cb.isSelected() ? "Selected" : "Deselected"));
        });

        f.add(tf); f.add(cb);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
