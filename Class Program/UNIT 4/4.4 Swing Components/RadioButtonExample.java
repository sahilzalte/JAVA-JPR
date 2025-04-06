import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("RadioButton");
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        rb1.setBounds(50, 30, 80, 20);
        rb2.setBounds(130, 30, 80, 20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2);
        f.add(rb1); f.add(rb2);
        f.setSize(250, 120);
        f.setLayout(null);
        f.setVisible(true);
    }
}
