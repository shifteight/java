import java.awt.*;
import java.awt.event.*;

public class ShowChoice implements ItemListener
{
	private Label display;

	public ShowChoice(Label d)
	{
		display = d;
	}

	public void itemStateChanged(ItemEvent a)
	{
		Object source = a.getSource();

		if(!(source instanceof Choice))
		{
			return;
		}

		Choice list = (Choice) source;
		String selected = list.getSelectedItem();
		display.setText(selected);
	}
}