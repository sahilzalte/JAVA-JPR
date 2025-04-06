import java.awt.*;

public class MenuExample {
    public static void main(String[] args) {
        Frame f = new Frame("Menu Example");

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem i1 = new MenuItem("Open");
        MenuItem i2 = new MenuItem("Save");
        MenuItem i3 = new MenuItem("Exit");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        mb.add(menu);

        f.setMenuBar(mb);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
