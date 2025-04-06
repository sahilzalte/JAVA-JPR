import javax.swing.*;

public class LabelTextField {
    public static void main(String[] args) {
        JFrame f = new JFrame("Label + TextField");
        f.add(new JLabel("Name:")).setBounds(30, 20, 100, 20);
        JTextField tf = new JTextField();
        tf.setBounds(100, 20, 100, 20);
        f.add(tf);
        f.setSize(250, 100);
        f.setLayout(null);
        f.setVisible(true);
    }
}
