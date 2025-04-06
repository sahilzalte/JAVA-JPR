import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table");
        String[][] data = {{"101", "Amit", "670000"}, {"102", "Jai", "780000"}};
        String[] col = {"ID", "Name", "Salary"};
        JTable table = new JTable(data, col);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 30, 200, 60);
        f.add(sp);
        f.setSize(280, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
}
