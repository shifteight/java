import java.awt.*;
import javax.swing.*;

public class CreateFrame {
    public static void main(String[] args) {
        // Create the frame
        String title = "Frame Title";
        JFrame frame = new JFrame(title);

        // Set to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a component to add to the frame
        JComponent comp = new JTextArea();

        // Add the component to the frame's content pane;
        // by default, the content pane has a border layout
        frame.getContentPane().add(comp, BorderLayout.CENTER);

        // Show the frame
        int width = 300;
        int height = 300;
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
