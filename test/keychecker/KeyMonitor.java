import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyMonitor extends KeyAdapter {
    KeyChecker display;

    KeyMonitor(KeyChecker display) {
        this.display = display;
    }

    public void keyTyped(KeyEvent e) {
        display.keyLabel.setText("" + e.getKeyChar());
        display.repaint();
    }
}

