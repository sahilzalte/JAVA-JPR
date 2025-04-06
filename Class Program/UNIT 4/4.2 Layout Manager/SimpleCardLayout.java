import java.awt.*;
import java.awt.event.*;

public class SimpleCardLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout");
        CardLayout layout = new CardLayout();
        frame.setLayout(layout);

        for (int i = 1; i <= 3; i++)
            frame.add(String.valueOf(i), new Label("Card " + i));

        frame.addMouseListener(new MouseAdapter() {
            int index = 1;

            @Override
            public void mouseClicked(MouseEvent e) {
                index = index % 3 + 1;
                layout.show(frame, String.valueOf(index));
            }
        });

        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
