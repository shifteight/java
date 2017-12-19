package lookandfeel;

import java.awt.Component;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.plaf.synth.*;

public class SynthDialog extends JFrame {
    public SynthDialog() {
    	JLabel label = new JLabel("Find What:");;
        JTextField textField = new JTextField();
        JCheckBox caseCheckBox = new JCheckBox("Match Case");
        JCheckBox wrapCheckBox = new JCheckBox("Wrap Around");
        JCheckBox wholeCheckBox = new JCheckBox("Whole Words");
        JCheckBox backCheckBox = new JCheckBox("Search Backwards");
        JButton findButton = new JButton("Find");
        JButton cancelButton = new JButton("Cancel");

        // remove redundant default border of check boxes - they would hinder
        // correct spacing and aligning (maybe not needed on some look and feels)
        caseCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wrapCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        wholeCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        backCheckBox.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addComponent(label)
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(textField)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(caseCheckBox)
                        .addComponent(wholeCheckBox))
                    .addGroup(layout.createParallelGroup(LEADING)
                        .addComponent(wrapCheckBox)
                        .addComponent(backCheckBox))))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(findButton)
                .addComponent(cancelButton))
        );
       
        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(label)
                .addComponent(textField)
                .addComponent(findButton))
            .addGroup(layout.createParallelGroup(LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(caseCheckBox)
                        .addComponent(wrapCheckBox))
                    .addGroup(layout.createParallelGroup(BASELINE)
                        .addComponent(wholeCheckBox)
                        .addComponent(backCheckBox)))
                .addComponent(cancelButton))
        );

        setTitle("Find");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    
    private static void initLookAndFeel() {
         SynthLookAndFeel lookAndFeel = new SynthLookAndFeel();
       
 
            try {
            	
            	// SynthLookAndFeel load() method throws a checked exception
            	// (java.text.ParseException) so it must be handled
            	lookAndFeel.load(SynthDialog.class.getResourceAsStream("synthDemo.xml"),
                				  SynthDialog.class);
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   //Set the look and feel.
        		   initLookAndFeel();

       	   		   //Make sure we have nice window decorations.
       			   JFrame.setDefaultLookAndFeelDecorated(true);	
               	} catch (Exception ex) {
                    ex.printStackTrace();
                }
                new SynthDialog().setVisible(true);
            }
        });
    }
}

