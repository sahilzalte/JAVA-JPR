import java.awt.*;
import java.awt.event.*;

public class KeyExample extends Frame implements KeyListener {
    TextField tf;

    KeyExample() {
        tf = new TextField();
        tf.setBounds(100, 100, 150, 20);
        tf.addKeyListener(this);
        add(tf);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyExample();
    }
}
