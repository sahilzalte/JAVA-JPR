import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("ComboBox");
        JComboBox<String> cb = new JComboBox<>(new String[] { "Java", "Python", "C++" });
        cb.setBounds(50, 30, 100, 20);
        f.add(cb);
        f.setSize(200, 120);
        f.setLayout(null);
        f.setVisible(true);
    }
}
