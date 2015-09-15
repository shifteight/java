import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PrankPanel extends JPanel implements MouseMotionListener {
    JButton ok = new JButton("OK");
    int buttonX, buttonY, mouseX, mouseY;
    int width, height;

    PrankPanel() {
        super();
        setLayout(null);
        addMouseMotionListener(this);
        buttonX = 110;
        buttonY = 110;
        ok.setBounds(new Rectangle(buttonX, buttonY, 70, 20));
        add(ok);
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        width = (int)getSize().getWidth();
        height = (int)getSize().getHeight();
        if (Math.abs((mouseX + 35) - buttonX) < 50) {
            buttonX = moveButton(mouseX, buttonX, width);
            repaint();
        }
        if (Math.abs((mouseY + 10) - buttonY) < 50) {
            buttonY = moveButton(mouseY, buttonY, height);
            repaint();
        }
    }

    public void mouseDragged(MouseEvent e) {
        // ignore this event
    }

    private int moveButton(int mouseAt, int buttonAt, int border) {
        if (buttonAt < mouseAt) {
            buttonAt--;
        } else {
            buttonAt++;
        }
        if (buttonAt > (border - 20)) {
            buttonAt = 10;
        }
        if (buttonAt < 0) {
            buttonAt = border - 80;
        }
        return buttonAt;
    }

    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        ok.setBounds(buttonX, buttonY, 70, 20);
    }
}
