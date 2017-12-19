import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo extends JFrame
{
	private JRadioButton small, medium, large;
	private JButton button;

	public JRadioButtonDemo(String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();

		ButtonGroup group = new ButtonGroup(); // create a radio group

		small = new JRadioButton("small");
		medium = new JRadioButton("medium");
		large = new JRadioButton("large");

		//add the radio buttons to the same group
		group.add(small);
		group.add(medium);
		group.add(large);

		button = new JButton("Click here");
		button.setBounds(100,50,100, 50);
		JPanel center = new JPanel();
		center.setLayout(null);
		center.add(button);
		contentPane.add(center, BorderLayout.CENTER);

		//add the radio buttons to the frame
		JPanel north = new JPanel();
		north.add(small);
		north.add(medium);
		north.add(large);

		contentPane.add(north, BorderLayout.NORTH);

		//register the event listener
		SwingChangeSize listener = new SwingChangeSize(button);
		small.addItemListener(listener);
		medium.addItemListener(listener);
		large.addItemListener(listener);
	}

	public static void main(String [] args)
	{
		JFrame f = new JRadioButtonDemo("JRadioButtonDemo");
		f.setSize(300,200);
		f.setVisible(true);
	}
}