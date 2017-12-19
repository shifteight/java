package lookandfeel;

/*
 * SynthApplication.java requires a Synth XML file.
 * It should be in the class directory. Also required
 * are image files, which should be in the classes\images
 * directory
 */
 
 
import javax.swing.*;          
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.synth.*;

public class SynthApplication implements ActionListener {
    private static String labelPrefix = "Number of button clicks: ";
    private int numClicks = 0;
    private static String synthFile = "buttonSkin.xml";
    final JLabel label = new JLabel(labelPrefix + "0    ");

    public Component createComponents() {
        JButton button = new JButton("I'm a Swing button!");
        button.setMnemonic(KeyEvent.VK_I);
        button.addActionListener(this);
        label.setLabelFor(button);

        /*
         * An easy way to put space between a top-level container
         * and its contents is to put the contents in a JPanel
         * that has an "empty" border.
         */
        JPanel pane = new JPanel(new GridLayout(0, 1));
        pane.add(button);
        pane.add(label);
        pane.setBorder(BorderFactory.createEmptyBorder(
                                        30, //top
                                        30, //left
                                        10, //bottom
                                        30) //right
                                        );

        return pane;
    }

    public void actionPerformed(ActionEvent e) {
        numClicks++;
        label.setText(labelPrefix + numClicks);
    }

    private static void initLookAndFeel() {
       // String lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
       SynthLookAndFeel lookAndFeel = new SynthLookAndFeel();
       
 
            try {
            	lookAndFeel.load(SynthApplication.class.getResourceAsStream(synthFile),
                				  SynthApplication.class);
                UIManager.setLookAndFeel(lookAndFeel);
            } 
            
            catch (Exception e) {
                System.err.println("Couldn't get specified look and feel ("
                                   + lookAndFeel
                                   + "), for some reason.");
                System.err.println("Using the default look and feel.");
                e.printStackTrace();
            }
        
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Set the look and feel.
        initLookAndFeel();

        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("SynthApplication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SynthApplication app = new SynthApplication();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
