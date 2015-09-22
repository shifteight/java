/**
 * Created by Kevin on 9/15/15.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIDemo extends JPanel implements ActionListener {

    public static void main(String[] args) {
        JFrame window = new JFrame("GUI Demo");
        window.setContentPane(new GUIDemo());
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocation(150, 100);
        window.setVisible(true);
    }

    private JTextArea transcript;
    private JComboBox<String> combobox;

    public GUIDemo() {
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
        setBackground(Color.WHITE);

        setLayout(new GridLayout(1, 2, 3, 3));

        transcript = new JTextArea();
        transcript.setEditable(false);
        transcript.setMargin(new Insets(4, 4, 4, 4));
        JPanel left = new JPanel();
        left.setLayout(new GridLayout(4, 2, 3, 10));
        left.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        add(left);
        add(new JScrollPane(transcript));

        JLabel lab = new JLabel("Push Button:   ", JLabel.RIGHT);
        left.add(lab);
        JButton b = new JButton("Click Me!");
        b.addActionListener(this);
        left.add(b);

        lab = new JLabel("Checkbox:   ", JLabel.RIGHT);
        left.add(lab);
        JCheckBox c = new JCheckBox("Click me!");
        c.addActionListener(this);
        left.add(c);

        lab = new JLabel("Text Field:   ", JLabel.RIGHT);
        left.add(lab);
        JTextField t = new JTextField("Type here!");
        t.addActionListener(this);
        left.add(t);

        lab = new JLabel("Pop-up Menu:   ", JLabel.RIGHT);
        left.add(lab);
        combobox = new JComboBox<String>();
        combobox.addItem("First Option");
        combobox.addItem("Second Option");
        combobox.addItem("Third Option");
        combobox.addItem("Fourth Option");
        combobox.addActionListener(this);
        left.add(combobox);
    }

    private void post(String message) { // add a line to the transcript
        transcript.append(message + "\n\n");
    }

    /**
     * Respond to an ActionEvent from one of the GUI components in the panel.
     * In each case, a message about the event is posted to the transcript.
     * (This method is part of the ActionListener interface.)
     */
    public void actionPerformed(ActionEvent evt) {
        Object target = evt.getSource(); // which component produced this event?
        if (target instanceof JButton) {
            post("Button was clicked.");
        } else if (target instanceof JTextField) {
            post("Pressed return in TextField\nwith contents:\n    "
                    + evt.getActionCommand());
        } else if (target instanceof JCheckBox) {
            if (((JCheckBox) target).isSelected())
                post("Checkbox was turned on.");
            else
                post("Checkbox was turned off.");
        } else if (target == combobox) {
            Object item = combobox.getSelectedItem();
            post("Item \"" + item + "\" selected\nfrom pop-up menu.");
        }
    }

} // end class GUIDemo
