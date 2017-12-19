import java.awt.*;
import javax.swing.*;

public class ButtonDemo extends JFrame
{
	private JButton red, blue, white;

	public ButtonDemo(String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		red = new JButton("Red");
		blue = new JButton("Blue");
		white = new JButton("White");

		//add the buttons to the frame
		JPanel south = new JPanel();
		south.add(red);
		south.add(blue);
		south.add(white);

		Container contentPane = this.getContentPane();
		contentPane.add(south, BorderLayout.SOUTH);

		//register the event listener
		ColorChanger changer = new ColorChanger(this);
		red.addActionListener(changer);
		blue.addActionListener(changer);
		white.addActionListener(changer);
	}

	public static void main(String [] args)
	{
		JFrame f = new ButtonDemo("ButtonDemo");
		f.setSize(300,300);
		f.setVisible(true);
	}
}