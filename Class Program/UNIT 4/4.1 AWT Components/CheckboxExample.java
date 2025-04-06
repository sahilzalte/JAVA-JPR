import java.awt.*;

public class CheckboxExample {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox Example");
        
        // Individual checkboxes
        Checkbox cb1 = new Checkbox("Java");
        Checkbox cb2 = new Checkbox("Python", true); // pre-selected
        Checkbox cb3 = new Checkbox("C++");
        
        // Radio buttons using CheckboxGroup
        CheckboxGroup group = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Option 1", group, false);
        Checkbox radio2 = new Checkbox("Option 2", group, true);
        Checkbox radio3 = new Checkbox("Option 3", group, false);
        
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(radio1);
        f.add(radio2);
        f.add(radio3);
        
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}