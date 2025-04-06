import javax.swing.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("ScrollPane");
        JTextArea ta = new JTextArea("Scrollable text...");
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(30, 30, 200, 80);
        f.add(sp);
        f.setSize(300, 180);
        f.setLayout(null);
        f.setVisible(true);
    }
}
