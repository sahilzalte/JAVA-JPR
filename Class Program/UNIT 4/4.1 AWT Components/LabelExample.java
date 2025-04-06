import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        Frame f = new Frame("Label Example");
        
        Label label1 = new Label("Simple Label");
        Label label2 = new Label("Centered Label", Label.CENTER);
        Label label3 = new Label("Right Aligned", Label.RIGHT);
        
        f.add(label1);
        f.add(label2);
        f.add(label3);
        
        f.setSize(300, 150);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}