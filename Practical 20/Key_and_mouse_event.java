import javax.swing.*;
import java.awt.event.*;

public class Key_and_mouse_event extends JFrame implements KeyListener, MouseListener {
    JLabel label = new JLabel("Press a key or click the mouse", SwingConstants.CENTER);

    public Key_and_mouse_event() {
        setTitle("Event Handling");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label);
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Key_and_mouse_event();
    }
}
