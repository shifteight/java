// Your first Swing program.

/*
 * <Applet code=THello width=300 height=150>
 * </Applet>
*/

import javax.swing.*; 
import java.awt.event.*;

// This is your Swing applet (extending JApplet).

public class THello extends JApplet {
    public void init() {
        getContentPane().add(new JLabel("Hello, Swing!", JLabel.CENTER));
    }

    public static void main(String[] args) {
        // Create a Swing frame.
        JFrame f = new JFrame("THello");

        // Create an instance of the THello applet.
        THello helloApplet = new THello();

        // Initialize the applet instance.
        helloApplet.init();

        // Add the applet to the JFrame's content pane.
        f.getContentPane().add(helloApplet);

        // Add the listener to close the frame.
        f.addWindowListener(new WindowEventHandler());

        // Assign the frame size and display it.
        f.setSize(300, 150); // frame: width=300, height=150
        f.setVisible(true); // display the frame
    }
}

// Class to close the frame and exit the application.
class WindowEventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}


