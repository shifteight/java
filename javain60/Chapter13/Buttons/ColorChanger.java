import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class ColorChanger implements ActionListener
{
	private Container container;

	public ColorChanger(JFrame c)
	{
		container = c.getContentPane();
	}

	public void actionPerformed(ActionEvent a)
	{
		String label = a.getActionCommand();
		if(label.equals("Red"))
		{
			container.setBackground(Color.RED);
		}
		else if(label.equals("Blue"))
		{
			container.setBackground(Color.BLUE);
		}
		else if(label.equals("White"))
		{
			container.setBackground(Color.WHITE);
		}
	}
}