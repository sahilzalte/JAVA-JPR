import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Border Layout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BorderLayout
        frame.setLayout(new BorderLayout());

        // Create buttons
        JButton topButton = new JButton("Top");
        JButton bottomButton = new JButton("Bottom");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        // Add buttons to the frame with BorderLayout positions
        frame.add(topButton, BorderLayout.NORTH);
        frame.add(bottomButton, BorderLayout.SOUTH);
        frame.add(leftButton, BorderLayout.WEST);
        frame.add(rightButton, BorderLayout.EAST);

        // Set frame visible
        frame.setVisible(true);
    }
}
