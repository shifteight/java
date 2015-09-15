import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements FocusListener {
    JTextField value1 = new JTextField("0", 5);
    JLabel plus = new JLabel("+");
    JTextField value2 = new JTextField("0", 5);
    JLabel equals = new JLabel("=");
    JTextField sum = new JTextField("0", 5);

    public Calculator() {
        super("Add Two Numbers");
        setSize(350, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow);
        // add listeners
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        // set up sum field
        sum.setEditable(false);
        // add components
        add(value1);
        add(plus);
        add(value2);
        add(equals);
        add(sum);
        setVisible(true);
    }

    public void focusGained(FocusEvent evt) {
        try {
            float total = Float.parseFloat(value1.getText()) + 
                Float.parseFloat(value2.getText());
            sum.setText("" + total);
        } catch (NumberFormatException nfe) {
            value1.setText("0");
            value2.setText("0");
            sum.setText("0");
        }
    }

    public void focusLost(FocusEvent evt) {
        focusGained(evt);
    }

    public static void main(String[] args) {
        Calculator frame = new Calculator();
    }
}
