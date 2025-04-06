import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("GridBagLayout Example");
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(new Button("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(new Button("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        f.add(new Button("Button 3"), gbc);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
