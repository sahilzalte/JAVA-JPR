import java.awt.*;

public class TextAreaExample {
    public static void main(String[] args) {
        Frame f = new Frame("TextArea Example");

        TextArea ta1 = new TextArea("Default text", 5, 30);
        TextArea ta2 = new TextArea(10, 40);
        ta2.setText("Second text area\nwith multiple lines");

        f.add(ta1);
        f.add(ta2);

        f.setSize(350, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}