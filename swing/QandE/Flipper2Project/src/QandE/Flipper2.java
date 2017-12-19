package QandE;

import java.util.List;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.SwingWorker;

public class Flipper2 extends JFrame 
                  implements ActionListener {
    GridBagConstraints constraints;
    JTextField headsText, totalText, ratioText;
    Border border =
        BorderFactory.createLoweredBevelBorder();
    JButton startButton, stopButton;
    FlipTask flipTask;

    private JTextField makeText() {
        JTextField t = new JTextField(20);
        t.setEditable(false);
        t.setHorizontalAlignment(JTextField.RIGHT);
        t.setBorder(border);
        getContentPane().add(t, constraints);
        return t;
    }

    private JButton makeButton(String caption) {
        JButton b = new JButton(caption);
        b.setActionCommand(caption);
        b.addActionListener(this);
        getContentPane().add(b, constraints);
        return b;
    }
    public Flipper2() {
        super("Flipper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make text boxes
        getContentPane().setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.insets = new Insets(3, 10, 3, 10);
        headsText = makeText();
        totalText = makeText();
        ratioText = makeText();

        //Make buttons
        startButton = makeButton("Start");
        stopButton = makeButton("Stop");
        stopButton.setEnabled(false);

        //Display the window.
        pack();
        setVisible(true);
    }

    class FlipPair {
        long heads, total;
        FlipPair(long heads, long total) {
            this.heads = heads;
            this.total = total;
        }
    }

    class FlipTask extends SwingWorker<Object, FlipPair> {
        protected Object doInBackground() {
            long heads = 0;
            long total = 0;
            Random random = new Random();
            while (!isCancelled()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    //Cancelled!
                    return null;
                }
                total++;
                if (random.nextBoolean()) {
                    heads++;
                }
                publish(new FlipPair(heads, total));
            }
            return null;
        }

        protected void process(List<FlipPair> pairs) {
            FlipPair pair = pairs.get(pairs.size() - 1);
            headsText.setText(String.format("%d", pair.heads));
            totalText.setText(String.format("%d", pair.total));
            ratioText.setText(String.format("%g", 
                    ((double) pair.heads)/((double) pair.total)));
        }
    }



    public void actionPerformed(ActionEvent e) {
        //Only two buttons: if not "Start" then "Stop"
        boolean startMode = e.getActionCommand().equals("Start");
        startButton.setEnabled(!startMode);
        stopButton.setEnabled(startMode);
        if (startMode) {
            flipTask = new FlipTask();
            flipTask.execute();
        } else {
            flipTask.cancel(true);
            flipTask = null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Flipper2();
            }
        });
    }
}
