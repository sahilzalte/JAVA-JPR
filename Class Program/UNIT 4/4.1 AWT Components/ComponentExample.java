import java.awt.*;

public class ComponentExample {
    public static void main(String[] args) {
        Frame f = new Frame("Component Example");
        
        // Component is abstract, so we demonstrate with a concrete subclass (Label)
        Component myComponent = new Label("This is a component");
        myComponent.setBounds(50, 50, 200, 30);
        
        f.add(myComponent);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
}