import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingChangeSize implements ItemListener
{
	private Component component;

	public SwingChangeSize(Component c)
	{
		component = c;
	}

	public void itemStateChanged(ItemEvent e)
	{
		JRadioButton source = (JRadioButton) e.getItem(); // get a reference
		String size = (String) source.getText(); // get the label text

		if(size.equals("small"))
		{
			component.setSize(75,20);
		}
		else if(size.equals("medium"))
		{
			component.setSize(100,50);
		}
		else if(size.equals("large"))
		{
			component.setSize(150, 75);
		}
	}
}