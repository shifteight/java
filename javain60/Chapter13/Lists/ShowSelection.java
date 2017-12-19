import java.awt.*;
import java.awt.event.*;

public class ShowSelection implements ActionListener
{
	private Label display;

	public ShowSelection(Label d)
	{
		display = d;
	}

	public void actionPerformed(ActionEvent a)
	{
		Object source = a.getSource();

		if(!(source instanceof List))
		{
			return;
		}

		List list = (List) source;
		String selected = list.getSelectedItem();
		display.setText(selected);
	}
}