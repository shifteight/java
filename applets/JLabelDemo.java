import java.awt.*;
import javax.swing.*;
/*
 * <applet code="JLabelDemo" width=250 height=150>
 * </applet>
 * */
public class JLabelDemo extends JApplet {
	public void init() {
	// Get content pane
	Container contentPane = getContentPane();
	// Create an icon
	ImageIcon ii = new ImageIcon("france.gif");
	// Create a label
	JLabel jl = new JLabel("France", ii, JLabel.CENTER);
	// Add label to the content pane
	contentPane.add(jl);
	}
}
