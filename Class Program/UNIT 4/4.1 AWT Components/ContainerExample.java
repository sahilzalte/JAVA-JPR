import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Frame f = new Frame("Container Example");
        
        // Panel is a concrete Container
        Container panel = new Panel();
        panel.setBounds(20, 20, 260, 100);
        panel.setBackground(Color.LIGHT_GRAY);
        
        // Add components to the container
        panel.add(new Label("This is inside a container"));
        panel.add(new Button("OK"));
        
        f.add(panel);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
}