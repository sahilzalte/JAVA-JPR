import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("KeyEvent");

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 200, 20);

        tf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });

        f.add(tf);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
