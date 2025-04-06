import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("MouseEvent");

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 200, 20);

        tf.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked on TextField");
            }
        });

        f.add(tf);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
