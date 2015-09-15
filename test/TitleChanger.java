import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TitleChanger extends JFrame implements ActionListener {
    JButton b1 = new JButton("北京");
    JButton b2 = new JButton("上海");

    public TitleChanger() {
        super("Title Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == b1) {
            setTitle("北京");
        } else if (source == b2) {
            setTitle("上海");
        }
        repaint();
    }

    public static void main(String[] args) {
        TitleChanger frame = new TitleChanger();
    }
}
