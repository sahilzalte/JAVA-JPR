import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        Frame f = new Frame("Panel Example");
        
        Panel panel = new Panel();
        panel.setBackground(Color.CYAN);
        panel.add(new Label("This is a Panel"));
        panel.add(new Button("Panel Button"));
        
        f.add(panel);
        f.setSize(300, 150);
        f.setVisible(true);
    }
}