import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MousePrank extends JFrame implements ActionListener {
    public MousePrank() {
        super("Message");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 220);
        BorderLayout border = new BorderLayout();
        setLayout(border);
        JLabel message = new JLabel("Click OK to close this program.");
        add(BorderLayout.NORTH, message);
        PrankPanel prank = new PrankPanel();
        prank.ok.addActionListener(this);
        add(BorderLayout.CENTER, prank);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public Insets getInsets() {
        return new Insets(40, 10, 10, 10);
    }

    public static void main(String[] args) {
        new MousePrank();
    }
}
