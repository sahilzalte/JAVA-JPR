import java.awt.*;
import java.awt.event.*;

public class ActionExample extends Frame implements ActionListener {
    Button b;

    ActionExample() {
        b = new Button("Click Me");
        b.setBounds(100, 100, 80, 30);
        b.addActionListener(this);
        add(b);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionExample();
    }
}
