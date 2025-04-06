import java.awt.*;
import java.awt.event.*;

public class ItemExample extends Frame implements ItemListener {
    Checkbox cb;

    ItemExample() {
        cb = new Checkbox("Accept Terms");
        cb.setBounds(100, 100, 150, 20);
        cb.addItemListener(this);
        add(cb);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        System.out.println("Checkbox state changed");
    }

    public static void main(String[] args) {
        new ItemExample();
    }
}
