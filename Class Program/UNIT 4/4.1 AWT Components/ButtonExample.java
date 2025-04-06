import java.awt.*;

public class ButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        
        Button btn1 = new Button("Click Me");
        Button btn2 = new Button("Disabled Button");
        btn2.setEnabled(false);
        
        f.add(btn1);
        f.add(btn2);
        
        f.setSize(300, 100);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}