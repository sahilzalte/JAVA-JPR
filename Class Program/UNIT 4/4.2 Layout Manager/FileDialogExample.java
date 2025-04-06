import java.awt.*;

public class FileDialogExample {
    public static void main(String[] args) {
        Frame f = new Frame("FileDialog Example");
        FileDialog fd = new FileDialog(f, "Select File", FileDialog.LOAD);
        fd.setVisible(true);
    }
}
