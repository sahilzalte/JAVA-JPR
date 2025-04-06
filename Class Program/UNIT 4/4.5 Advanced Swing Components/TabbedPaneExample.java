import javax.swing.*;

public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tabs");
        JTabbedPane tabs = new JTabbedPane();
        tabs.setBounds(30, 30, 200, 100);
        tabs.add("Tab 1", new JLabel("This is Tab 1"));
        tabs.add("Tab 2", new JLabel("This is Tab 2"));
        f.add(tabs);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
