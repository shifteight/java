import java.awt.*;
import java.awt.event.*;

public class RandomColor implements ActionListener
{
	private Container container;

	public RandomColor(Container c)
	{
		container = c;
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e + " just occurred.");
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color color = new Color(red, green, blue);

		container.setBackground(color);
	}
}