import javax.swing.*;

public class TooltipExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tooltip");
        JButton btn = new JButton("Hover me");
        btn.setToolTipText("This is a tooltip!");
        btn.setBounds(30, 30, 150, 30);
        f.add(btn);
        f.setSize(250, 120);
        f.setLayout(null);
        f.setVisible(true);
    }
}
