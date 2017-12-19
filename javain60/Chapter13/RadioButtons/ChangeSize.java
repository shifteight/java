import java.awt.*;
import java.awt.event.*;

public class ChangeSize implements ItemListener
{
	private Component component;

	public ChangeSize(Component c)
	{
		component = c;
	}

	public void itemStateChanged(ItemEvent e)
	{
		String size = (String) e.getItem();

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