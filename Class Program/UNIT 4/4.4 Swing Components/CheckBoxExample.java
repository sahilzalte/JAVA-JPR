import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBox");
        JCheckBox check = new JCheckBox("Accept");
        check.setBounds(50, 30, 100, 20);
        f.add(check);
        f.setSize(200, 120);
        f.setLayout(null);
        f.setVisible(true);
    }
}
