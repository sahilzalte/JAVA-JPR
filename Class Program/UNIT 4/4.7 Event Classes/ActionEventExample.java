import javax.swing.*;

public class ActionEventExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("ActionEvent");

        JTextField tf = new JTextField();
        tf.setBounds(50, 30, 200, 20);

        JButton b = new JButton("Click");
        b.setBounds(50, 60, 80, 30);

        b.addActionListener(e -> tf.setText("Button Clicked"));

        f.add(tf); f.add(b);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
