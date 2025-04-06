import java.awt.*;

public class WindowExample {
    public static void main(String[] args) {
        // Window is abstract, so we use Frame which extends Window
        Window window = new Frame("Window Example");
        
        window.setSize(300, 200);
        window.setLocation(100, 100);
        window.setVisible(true);
        
        // Add a component directly to the window
        ((Frame)window).add(new Label("This is a Window", Label.CENTER));
        ((Frame)window).setLayout(new FlowLayout());
    }
}