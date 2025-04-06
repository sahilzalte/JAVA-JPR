import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button");
        JButton btn = new JButton("Submit");
        btn.setBounds(50, 30, 100, 30);
        f.add(btn);
        f.setSize(200, 120);
        f.setLayout(null);
        f.setVisible(true);
    }
}
