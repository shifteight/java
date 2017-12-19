import java.awt.*;
import javax.swing.*;

public class HighlightDemo extends JFrame
{
	private JButton [] buttons;

	public HighlightDemo(String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(2,3,30,30));

		buttons = new JButton[6];

		HighlightComponent listener = new HighlightComponent();
		//register the listener with the JFrame's content pane
		contentPane.addMouseListener(listener);

		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton("Click " + (i + 1));
			contentPane.add(buttons[i]);

			//register the listener with each button
			buttons[i].addMouseListener(listener);
		}
	}

	public static void main(String [] args)
	{
		JFrame f = new HighlightDemo("HighlightDemo");
		f.setSize(300,200);
		f.setVisible(true);
	}
}