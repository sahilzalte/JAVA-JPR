import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout Example");
        f.setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        for (int i = 1; i <= 6; i++) {
            f.add(new Button("Button " + i));
        }

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
