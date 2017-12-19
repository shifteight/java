import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MixSwingColors implements ItemListener
{
	private Container pallette;
	private boolean red, yellow, blue;

	public MixSwingColors(Container c)
	{
		pallette = c;
	}

	public void itemStateChanged(ItemEvent e)
	{
		JCheckBox source = (JCheckBox) e.getItem(); // return a reference to the checkbox
		String item = source.getText(); // get the Text of the checkbox
		int state = e.getStateChange();

		if(item.equals("Red"))
		{
			red = (state == ItemEvent.SELECTED) ? true : false;
		}
		else if(item.equals("Blue"))
		{
			blue = (state == ItemEvent.SELECTED) ? true : false;
		}
		else if(item.equals("Yellow"))
		{
			yellow = (state == ItemEvent.SELECTED) ? true : false;
		}

		Color mixed = Color.WHITE;

		if(yellow && !red && !blue)
		{
			mixed = Color.YELLOW;
		}
		else if(red && !blue && !yellow)
		{
			mixed = Color.RED;
		}
		else if(blue && !red && !yellow)
		{
			mixed = Color.BLUE;
		}
		else if(red && blue && yellow)
		{
			mixed = new Color(128, 64, 0);
		}
		else if(red && yellow)
		{
			mixed = Color.ORANGE;
		}
		else if(red && blue)
		{
			mixed = new Color(255, 0, 255);
		}
		else if(yellow && blue)
		{
			mixed = Color.GREEN;
		}

		pallette.setBackground(mixed);
	}
}