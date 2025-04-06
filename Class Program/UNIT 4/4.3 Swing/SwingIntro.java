import javax.swing.*;

public class SwingIntro {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Example");
        JLabel l = new JLabel("Hello, Swing!");
        l.setBounds(50, 50, 100, 20);

        f.add(l);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
