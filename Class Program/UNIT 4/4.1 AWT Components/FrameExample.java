import java.awt.*;

public class FrameExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame Example");
        
        frame.add(new Label("This is a Frame", Label.CENTER));
        frame.add(new Button("Click Me"));
        
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}