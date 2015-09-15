import java.awt.*;
import javax.swing.*;

public class CreateWindow {
    public static void main(String[] args) {
        // Create the window
        JWindow window = new JWindow();

        // Create a component to add to the window
        JComponent comp = new JTextArea();

        // Add the component to the window's content pane;
        // by default, the content pane has a border layout
        window.getContentPane().add(comp, BorderLayout.CENTER);

        // Show the window
        int width = 300;
        int height = 300;
        window.setSize(width, height);
        window.setVisible(true);
    }
}
