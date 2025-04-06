import javax.swing.*;

public class TreeExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tree");
        JTree tree = new JTree();
        tree.setBounds(30, 30, 120, 100);
        f.add(tree);
        f.setSize(250, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
