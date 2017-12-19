import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo extends JFrame
{
	private JCheckBox red, yellow, blue;

	public JCheckBoxDemo(String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();

		red = new JCheckBox("Red");
		blue = new JCheckBox("Blue");
		yellow = new JCheckBox("Yellow");

		//add the checkboxes to the frame
		Panel north = new Panel();
		north.add(red);
		north.add(blue);
		north.add(yellow);

		contentPane.add(north, BorderLayout.NORTH);

		//register the event listener
		MixSwingColors listener = new MixSwingColors(contentPane);
		red.addItemListener(listener);
		blue.addItemListener(listener);
		yellow.addItemListener(listener);
	}

	public static void main(String [] args)
	{
		JFrame f = new JCheckBoxDemo("JCheckBoxDemo");
		f.setSize(300,300);
		f.setVisible(true);
	}
}