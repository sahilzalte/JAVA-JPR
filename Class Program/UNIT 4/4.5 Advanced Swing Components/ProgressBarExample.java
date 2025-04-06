import javax.swing.*;

public class ProgressBarExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Progress");
        JProgressBar pb = new JProgressBar();
        pb.setValue(70);
        pb.setBounds(30, 30, 200, 20);
        f.add(pb);
        f.setSize(280, 120);
        f.setLayout(null);
        f.setVisible(true);
    }
}
