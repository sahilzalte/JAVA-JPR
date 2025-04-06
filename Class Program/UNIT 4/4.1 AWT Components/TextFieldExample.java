import java.awt.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame f = new Frame("TextField Example");
        
        TextField tf1 = new TextField("Default text");
        TextField tf2 = new TextField(20); // columns
        TextField tf3 = new TextField("Uneditable", 15);
        tf3.setEditable(false);
        
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        
        f.setSize(300, 150);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}